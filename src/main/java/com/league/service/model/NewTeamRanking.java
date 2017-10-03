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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewTeamRanking {
    private String name;
    private double newSystemPoints;
    private Integer position;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getNewSystemPoints() {
        return newSystemPoints;
    }

    public void setNewSystemPoints(final double newSystemPoints) {
        this.newSystemPoints = newSystemPoints;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(final Integer position) {
        this.position = position;
    }

}
