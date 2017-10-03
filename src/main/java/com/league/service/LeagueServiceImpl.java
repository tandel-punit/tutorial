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

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.league.service.model.NewTeamRanking;

@Service("leagueService")
@Scope(value = "singleton")
public class LeagueServiceImpl implements LeagueService {

    @Override
    public List<NewTeamRanking> populateNewRanking(final long sessionID) {
        return new RankCalculator().calculate(sessionID);

    }

}
