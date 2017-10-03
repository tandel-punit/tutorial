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

public class CurrentRanking implements Serializable {
    private Integer id;
    private String name;
    private Integer competition_id;
    private Integer season_id;

    private GroupArr groups;

    private TeamStatArr standings;

    @Override
    public String toString() {
        return "CurrentRanking [id=" + id + ", name=" + name + ", competition_id=" + competition_id + ", season_id=" + season_id + ", groups="
                + groups + ", standings=" + standings + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getCompetition_id() {
        return competition_id;
    }

    public void setCompetition_id(final Integer competition_id) {
        this.competition_id = competition_id;
    }

    public Integer getSeason_id() {
        return season_id;
    }

    public void setSeason_id(final Integer season_id) {
        this.season_id = season_id;
    }

    public GroupArr getGroups() {
        return groups;
    }

    public void setGroups(final GroupArr groups) {
        this.groups = groups;
    }

    public TeamStatArr getStandings() {
        return standings;
    }

    public void setStandings(final TeamStatArr standings) {
        this.standings = standings;
    }

}
