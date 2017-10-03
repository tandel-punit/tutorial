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
package com.league.service.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewLeagueRanking {
    private String leagueName;

    private List<NewTeamRanking> newTeamRanking;

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(final String leagueName) {
        this.leagueName = leagueName;
    }

    public List<NewTeamRanking> getNewTeamRanking() {
        return newTeamRanking;
    }

    public void setNewTeamRanking(final List<NewTeamRanking> newTeamRanking) {
        this.newTeamRanking = newTeamRanking;
    }
}
