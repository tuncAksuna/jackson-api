package com.tuncode.jacksonapi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        try {

            ObjectMapper mapper = new ObjectMapper();
            Example exampleClass = mapper.readValue(new File("src/main/java/myFile.json"), Example.class);
            System.out.println("Age : " + exampleClass.getAge() + "\n" +
                    "First name : " + exampleClass.getFirstName() + "\n" +
                    "Last name : " + exampleClass.getLastName() + "\n" +
                    "Languages : " + exampleClass.getLanguages() + "\n" +
                    "Phone numbers : " + exampleClass.getAddress().getPhoneNumbers() + "\n" +
                    "Old Country 1  : " + exampleClass.getAddress().getOldCountries().getCountry1() + "\n" +
                    "Old County List : " + exampleClass.getAddress().getOldCountries().getOldCountryLists());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
