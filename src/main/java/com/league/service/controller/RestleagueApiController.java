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
package com.league.service.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.league.service.LeagueService;
import com.league.service.model.NewTeamRanking;
import com.league.service.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class RestleagueApiController {

    public static final Logger logger = LoggerFactory.getLogger(RestleagueApiController.class);

    @Autowired
    LeagueService leagueService;

    @RequestMapping(value = "/newranking/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> calculateNewRank(@PathVariable("id") final long id) {
        logger.info("Fetching User with id {}", id);
        try {
            final List<NewTeamRanking> populateNewRanking = leagueService.populateNewRanking(id);
            return new ResponseEntity<List<NewTeamRanking>>(populateNewRanking, HttpStatus.OK);
        } catch (final Exception e) {
            e.printStackTrace();
            return new ResponseEntity(new CustomErrorType("season id " + id + " not found"), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/rank", method = RequestMethod.GET)
    public ResponseEntity<?> defaultRank() {
        return calculateNewRank(1181);

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> welcome() {
        return new ResponseEntity(new String("Welcome to Scottish League REST API "), HttpStatus.OK);
    }
}