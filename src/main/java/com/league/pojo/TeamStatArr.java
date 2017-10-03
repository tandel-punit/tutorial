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
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("data")
public class TeamStatArr implements Serializable {
    @JsonProperty("data")
    List<TeamStat> standings;

    public List<TeamStat> getStandings() {
        return standings;
    }

    public void setStandings(final List<TeamStat> standings) {
        this.standings = standings;
    }

    @Override
    public String toString() {
        return "TeamStatArr [standings=" + standings + "]";
    }
}
