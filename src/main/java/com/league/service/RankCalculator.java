package com.league.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections15.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.league.pojo.Group;
import com.league.pojo.Players;
import com.league.pojo.Statistics;
import com.league.pojo.TeamDetails;
import com.league.pojo.TeamStat;
import com.league.service.model.NewTeamRanking;

public class RankCalculator {

    private static final Logger log = LoggerFactory.getLogger(RankCalculator.class);
    final Map<Integer, TeamDetails> teamDetailsMap = new HashedMap<>();
    final Map<Integer, Double> teamAvg = new HashedMap<>();
    final String delimiter = "~~~";
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    final LocalDate currentDate = LocalDate.now();

    final List<Integer> allplayersAgeInDate = new ArrayList<>();
    final Map<Integer, Double> teamPoints = new HashedMap<>();

    public List<NewTeamRanking> calculate(final long id) {
        final RestTemplate restTemplate = new RestTemplate();
        final Statistics quote = restTemplate.getForObject(
                "https://api.soccerama.pro/v1.2/standings/season/" + id + "?api_token=HOLCAStI6Z0OfdoPbjdSg5b41Q17w2W5P4WuoIBdC66Z54kUEvGWPIe33UYC",
                Statistics.class);
        log.info(quote.toString());

        quote.getCurrentRanking().stream().forEach(x -> {

            //todo:pending
            //	String key = x.getId()+delimiter+ x.getName()   +delimiter+ x.getCompetition_id()   +delimiter+ x.getSeason_id()  ;

            final List<Group> groups = x.getGroups().getGroups();

            groups.stream().forEach(y -> {
                final List<TeamStat> standings = y.getTeams().getStandings();
                standings.stream().forEach(xy -> {
                    final TeamDetails teamDetails = new TeamDetails();
                    teamDetails.setGroupTeamStat(xy);
                    final Players players = restTemplate.getForObject("https://api.soccerama.pro/v1.2/players/team/" + xy.getTeam_id()
                            + "?api_token=HOLCAStI6Z0OfdoPbjdSg5b41Q17w2W5P4WuoIBdC66Z54kUEvGWPIe33UYC", Players.class);
                    teamDetails.setPlayer(players.getPlayer());

                    allplayersAgeInDate.addAll(players.getPlayer().stream().map(p -> calculateAge(p.getBirth_date())).collect(Collectors.toList()));
                    //allplayersAgeInDate.add(player.getPlayer().);
                    teamAvg.put(xy.getTeam_id(), calculateAvg(players));
                    teamDetailsMap.put(xy.getTeam_id(), teamDetails);
                });
            });

            final List<TeamStat> standings = x.getStandings().getStandings();
            standings.stream().forEach(z -> {
                final TeamDetails teamDetails = teamDetailsMap.get(z.getTeam_id());
                teamDetails.setTeamStat(z);
                teamDetailsMap.put(z.getTeam_id(), teamDetails);
            });
        });

        calculateNewPoints();

        final Map<Integer, TeamDetails> result = teamDetailsMap.entrySet().stream().sorted(Map.Entry.comparingByValue(new TeamComparator()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("------------teamPoints---------------" + result);

        int i = 1;

        final List<NewTeamRanking> newRank = new LinkedList<>();

        for (final Map.Entry<Integer, TeamDetails> entry : result.entrySet()) {
            final NewTeamRanking newTeamRanking = new NewTeamRanking();
            newTeamRanking.setName(entry.getValue().getTeamStat().getTeam().getName());
            newTeamRanking.setNewSystemPoints(entry.getValue().getTeamStat().getPoints());
            newTeamRanking.setPosition(i);
            ++i;
            newRank.add(newTeamRanking);
        }
        return newRank;

    }

    private Double calculateAvg(final Players player) {
        return player.getPlayer().stream().collect(Collectors.averagingDouble(p -> calculateAge(p.getBirth_date())));
    }

    public int calculateAge(final String birthDateStr) {

        if (birthDateStr == null || birthDateStr.trim().isEmpty()) {
            return 0;
        }

        final LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);

        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getDays();
        } else {
            return 0;
        }
    }

    private void calculateNewPoints() {

        final Double average_age_of_all_players = allplayersAgeInDate.stream().collect(Collectors.averagingDouble(a -> a));

        teamDetailsMap.forEach((key, value) -> {

            final int goals_scored = value.getTeamStat().getOverall_goals_scored();
            final int goals_conceded = value.getTeamStat().getAway_goals_scored();
            final Integer points = value.getTeamStat().getPoints();

            final Double average_age_of_team_in_days = teamAvg.get(key);

            final double newSystemPoints = points * (goals_scored / goals_conceded) * (average_age_of_team_in_days / average_age_of_all_players);
            teamPoints.put(key, newSystemPoints);

        });

    }
}

class TeamComparator implements Comparator<TeamDetails> {
    @Override
    public int compare(final TeamDetails o1, final TeamDetails o2) {
        if (o1.getTeamStat().getPoints() == o2.getTeamStat().getPoints()) {
            final Integer o1Count = o1.getPlayer().stream().map(x -> x.getFullname()).filter(x -> x != null)
                .map(x -> x.replaceAll("[^aeiouAEIOU]", "")).mapToInt(x -> x.length()).sum();
            final Integer o2Count = o2.getPlayer().stream().map(x -> x.getFullname()).filter(x -> x != null)
                .map(x -> x.replaceAll("[^aeiouAEIOU]", "")).mapToInt(x -> x.length()).sum();
            o1Count.compareTo(o2Count);
        }
        return (o1.getTeamStat().getPoints().compareTo(o2.getTeamStat().getPoints()));
    }

}
