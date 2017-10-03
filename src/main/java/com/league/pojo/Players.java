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

import com.fasterxml.jackson.annotation.JsonProperty;

public class Players {
    @JsonProperty("data")
    private List<Player> player;

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(final List<Player> player) {
        this.player = player;
    }
}
