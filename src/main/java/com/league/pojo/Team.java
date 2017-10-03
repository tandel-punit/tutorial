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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
    private Integer coach_id;

    private Integer id;

    private String twitter;

    private String logo;

    private String name;

    private Integer venue_id;

    private Integer chairman_id;

    public Integer getCoach_id() {
        return coach_id;
    }

    public void setCoach_id(final Integer coach_id) {
        this.coach_id = coach_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(final String twitter) {
        this.twitter = twitter;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(final String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getVenue_id() {
        return venue_id;
    }

    public void setVenue_id(final Integer venue_id) {
        this.venue_id = venue_id;
    }

    public Integer getChairman_id() {
        return chairman_id;
    }

    public void setChairman_id(final Integer chairman_id) {
        this.chairman_id = chairman_id;
    }

    @Override
    public String toString() {
        return "Team [coach_id=" + coach_id + ", id=" + id + ", twitter=" + twitter + ", logo=" + logo + ", name=" + name + ", venue_id=" + venue_id
                + ", chairman_id=" + chairman_id + "]";
    }

}