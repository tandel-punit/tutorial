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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

public class TeamDetails {
    Group group;
    TeamStat teamStat;
    @JsonView(Player.class)
    List<Player> player;
    TeamStat groupTeamStat;

    public Group getGroup() {
        return group;
    }

    public void setGroup(final Group group) {
        this.group = group;
    }

    public TeamStat getTeamStat() {
        return teamStat;
    }

    public void setTeamStat(final TeamStat teamStat) {
        this.teamStat = teamStat;
    }

    public TeamStat getGroupTeamStat() {
        return groupTeamStat;
    }

    public void setGroupTeamStat(final TeamStat groupTeamStat) {
        this.groupTeamStat = groupTeamStat;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(final List<Player> player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "TeamDetails [group=" + group + ", teamStat=" + teamStat + ", player=" + player + ", groupTeamStat=" + groupTeamStat + "]";
    }

}
