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

public class Player {
    private Integer id;

    private String birth_country;

    private String weight;

    private String height;

    private String nationality;

    private String birth_date;

    private String name;

    private String photo;

    private String birth_place;

    private String shirt_number;

    private String fullname;

    public String getBirth_country() {
        return birth_country;
    }

    public void setBirth_country(final String birth_country) {
        this.birth_country = birth_country;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(final String nationality) {
        this.nationality = nationality;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(final String birth_date) {
        this.birth_date = birth_date;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(final String photo) {
        this.photo = photo;
    }

    public String getShirt_number() {
        return shirt_number;
    }

    public void setShirt_number(final String shirt_number) {
        this.shirt_number = shirt_number;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(final String fullname) {
        this.fullname = fullname;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(final String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(final String height) {
        this.height = height;
    }

    public String getBirth_place() {
        return birth_place;
    }

    public void setBirth_place(final String birth_place) {
        this.birth_place = birth_place;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player [id=" + id + ", birth_country=" + birth_country + ", weight=" + weight + ", height=" + height + ", nationality=" + nationality
                + ", birth_date=" + birth_date + ", name=" + name + ", photo=" + photo + ", birth_place=" + birth_place + ", shirt_number="
                + shirt_number + ", fullname=" + fullname + "]";
    }
}
