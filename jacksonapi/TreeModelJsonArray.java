package com.tuncode.jacksonapi;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class TreeModelJsonArray {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            JsonNode node = mapper.readTree(new File("src/main/resources/userArray.json"));

            for (JsonNode nodes : node) {

                // get id
                long id = nodes.path("id").asLong();
                System.out.println("Id : " + id);

                // get name
                JsonNode nameNode = nodes.path("name");
                if (!nameNode.isMissingNode()) {
                    System.out.println("First name : " + nameNode.path("first").asText());
                    System.out.println("Last name : " + nameNode.path("last").asText());
                }

                // get contact
                JsonNode contactNode = nodes.path("contact");
                if (contactNode.isArray() && !contactNode.isMissingNode()) {
                    for (JsonNode nodes2 : contactNode) {
                        String type = nodes2.path("type").asText();
                        String ref = nodes2.path("ref").asText();
                        System.out.println("Type : " + type);
                        System.out.println("Ref : " + ref);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
