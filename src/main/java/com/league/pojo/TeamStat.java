/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Punit Tandel
 *
 * The copyright to the computer program(s) herein is the property of
 * Punit Tandel. The programs may be used and/or copied only with written
 * permission from Punit Tandel. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.league.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamStat implements Serializable {
    private Integer position;

    private String result;

    private Integer overall_played;

    private Integer overall_goals_attempted;

    private Integer away_goals_attempted;

    private Integer current_round_id;

    private Integer away_goals_scored;

    private Integer home_goals_attempted;

    private Integer away_loose;

    private Integer overall_goals_scored;

    private Integer home_goals_scored;

    private String recent_form;

    private Integer points;

    private Integer away_win;

    private Integer overall_win;

    private Integer home_played;

    private String status;

    private Integer group_id;

    private Integer home_win;

    private Integer home_loose;

    private Integer current_round_name;

    private Integer home_draw;

    private Team team;

    private Integer overall_loose;

    private Integer overall_draw;

    private Integer away_draw;

    private Integer goal_difference;

    private Integer away_played;

    private String group;

    private Integer team_id;

    public Integer getPosition() {
        return position;
    }

    public void setPosition(final Integer position) {
        this.position = position;
    }

    public String getResult() {
        return result;
    }

    public void setResult(final String result) {
        this.result = result;
    }

    public Integer getOverall_played() {
        return overall_played;
    }

    public void setOverall_played(final Integer overall_played) {
        this.overall_played = overall_played;
    }

    public Integer getOverall_goals_attempted() {
        return overall_goals_attempted;
    }

    public void setOverall_goals_attempted(final Integer overall_goals_attempted) {
        this.overall_goals_attempted = overall_goals_attempted;
    }

    public Integer getAway_goals_attempted() {
        return away_goals_attempted;
    }

    public void setAway_goals_attempted(final Integer away_goals_attempted) {
        this.away_goals_attempted = away_goals_attempted;
    }

    public Integer getCurrent_round_id() {
        return current_round_id;
    }

    public void setCurrent_round_id(final Integer current_round_id) {
        this.current_round_id = current_round_id;
    }

    public Integer getAway_goals_scored() {
        return away_goals_scored;
    }

    public void setAway_goals_scored(final Integer away_goals_scored) {
        this.away_goals_scored = away_goals_scored;
    }

    public Integer getHome_goals_attempted() {
        return home_goals_attempted;
    }

    public void setHome_goals_attempted(final Integer home_goals_attempted) {
        this.home_goals_attempted = home_goals_attempted;
    }

    public Integer getAway_loose() {
        return away_loose;
    }

    public void setAway_loose(final Integer away_loose) {
        this.away_loose = away_loose;
    }

    public Integer getOverall_goals_scored() {
        return overall_goals_scored;
    }

    public void setOverall_goals_scored(final Integer overall_goals_scored) {
        this.overall_goals_scored = overall_goals_scored;
    }

    public Integer getHome_goals_scored() {
        return home_goals_scored;
    }

    public void setHome_goals_scored(final Integer home_goals_scored) {
        this.home_goals_scored = home_goals_scored;
    }

    public String getRecent_form() {
        return recent_form;
    }

    public void setRecent_form(final String recent_form) {
        this.recent_form = recent_form;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(final Integer points) {
        this.points = points;
    }

    public Integer getAway_win() {
        return away_win;
    }

    public void setAway_win(final Integer away_win) {
        this.away_win = away_win;
    }

    public Integer getOverall_win() {
        return overall_win;
    }

    public void setOverall_win(final Integer overall_win) {
        this.overall_win = overall_win;
    }

    public Integer getHome_played() {
        return home_played;
    }

    public void setHome_played(final Integer home_played) {
        this.home_played = home_played;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(final Integer group_id) {
        this.group_id = group_id;
    }

    public Integer getHome_win() {
        return home_win;
    }

    public void setHome_win(final Integer home_win) {
        this.home_win = home_win;
    }

    public Integer getHome_loose() {
        return home_loose;
    }

    public void setHome_loose(final Integer home_loose) {
        this.home_loose = home_loose;
    }

    public Integer getCurrent_round_name() {
        return current_round_name;
    }

    public void setCurrent_round_name(final Integer current_round_name) {
        this.current_round_name = current_round_name;
    }

    public Integer getHome_draw() {
        return home_draw;
    }

    public void setHome_draw(final Integer home_draw) {
        this.home_draw = home_draw;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(final Team team) {
        this.team = team;
    }

    public Integer getOverall_loose() {
        return overall_loose;
    }

    public void setOverall_loose(final Integer overall_loose) {
        this.overall_loose = overall_loose;
    }

    public Integer getOverall_draw() {
        return overall_draw;
    }

    public void setOverall_draw(final Integer overall_draw) {
        this.overall_draw = overall_draw;
    }

    public Integer getAway_draw() {
        return away_draw;
    }

    public void setAway_draw(final Integer away_draw) {
        this.away_draw = away_draw;
    }

    public Integer getGoal_difference() {
        return goal_difference;
    }

    public void setGoal_difference(final Integer goal_difference) {
        this.goal_difference = goal_difference;
    }

    public Integer getAway_played() {
        return away_played;
    }

    public void setAway_played(final Integer away_played) {
        this.away_played = away_played;
    }

    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(final Integer team_id) {
        this.team_id = team_id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "TeamStat [position=" + position + ", result=" + result + ", overall_played=" + overall_played + ", overall_goals_attempted="
                + overall_goals_attempted + ", away_goals_attempted=" + away_goals_attempted + ", current_round_id=" + current_round_id
                + ", away_goals_scored=" + away_goals_scored + ", home_goals_attempted=" + home_goals_attempted + ", away_loose=" + away_loose
                + ", overall_goals_scored=" + overall_goals_scored + ", home_goals_scored=" + home_goals_scored + ", recent_form=" + recent_form
                + ", points=" + points + ", away_win=" + away_win + ", overall_win=" + overall_win + ", home_played=" + home_played + ", status="
                + status + ", group_id=" + group_id + ", home_win=" + home_win + ", home_loose=" + home_loose + ", current_round_name="
                + current_round_name + ", home_draw=" + home_draw + ", team=" + team + ", overall_loose=" + overall_loose + ", overall_draw="
                + overall_draw + ", away_draw=" + away_draw + ", goal_difference=" + goal_difference + ", away_played=" + away_played + ", group="
                + group + ", team_id=" + team_id + "]";
    }

}
