package com.tuncode.jacksonapi;

import java.util.ArrayList;

public class Address {

    private String country;
    private String city;
    private String street;
    private String apartment;
    private ArrayList<?> phoneNumbers;
    private OldCountries oldCountries;

    public Address() {

    }

    public OldCountries getOldCountries() {
        return oldCountries;
    }

    public void setOldCountries(OldCountries oldCountries) {
        this.oldCountries = oldCountries;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public ArrayList<?> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<?> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
