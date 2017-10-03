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
package com.league.service;

import java.util.List;

import com.league.service.model.NewTeamRanking;

public interface LeagueService {

    List<NewTeamRanking> populateNewRanking(long sessionID);

}
