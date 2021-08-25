package com.tuncode.jacksonapi;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        try {

            ObjectMapper mapper = new ObjectMapper();

            Example exampleClass = mapper.readValue(new File("src/myFile.json"), Example.class);
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

        // Example : I will create a JSON string (following) with Java object class(created) and deserialize it to java class and the serialize it to an JSON String

        ObjectMapper objMapper = new ObjectMapper(); // provides functionality for reading and writing JSON
        String jsonString = "{\"name\":\"Cem Tunc\",\"age\":22}";

        try {
            Student javaClass = objMapper.readValue(jsonString, Student.class); // deserilization JSON to object - readValue() method get the object from the JSON
            System.out.println("Deserilazationing JSON -> Object: " + javaClass);

            jsonString = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(javaClass); // serialazation object to JSON
            System.out.println("Serializationing Object -> JSON: " + jsonString);

        } catch (JsonParseException ex) {
            ex.printStackTrace();
        } catch (JsonMappingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
