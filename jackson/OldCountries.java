package com.tuncode.jackson;

import java.util.ArrayList;

public class OldCountries {

    private String country1;
    private String country2;
    private String country3;
    private ArrayList<?> oldCountryLists;

    public OldCountries() {

    }

    public ArrayList<?> getOldCountryLists() {
        return oldCountryLists;
    }

    public void setOldCountryLists(ArrayList<?> oldCountryLists) {
        this.oldCountryLists = oldCountryLists;
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getCountry3() {
        return country3;
    }

    public void setCountry3(String country3) {
        this.country3 = country3;
    }
}
