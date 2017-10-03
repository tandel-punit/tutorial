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

import com.fasterxml.jackson.annotation.JsonProperty;

public class Group implements Serializable {
    private Integer id;
    private String name;
    @JsonProperty("teams")
    private TeamStatArr teams;

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

    public TeamStatArr getTeams() {
        return teams;
    }

    public void setTeams(final TeamStatArr teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "Group [id=" + id + ", name=" + name + ", teams=" + teams + "]";
    }

}
