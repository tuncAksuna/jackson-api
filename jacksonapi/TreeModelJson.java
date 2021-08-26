package com.tuncode.jacksonapi;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class TreeModelJson {

    public static void main(String[] args) {
        // Tree model to represent the JSON structure and perform the CRUD operations via "JsonNode"
        // Tree Model is useful, especially in cases where a JSON structure does not map nicely to Java classes.

        ObjectMapper mapper = new ObjectMapper();

        try {

            JsonNode root = mapper.readTree(new File(("src/main/resources/user.json")));
            // get id
            long id = root.path("íd").asLong();
            System.out.println("Id : " + id);

            // get name
            JsonNode nameNode = root.path("name");
            if (!nameNode.isMissingNode()) { // if "name" node is exist
                System.out.println("First name : " + nameNode.path("first").asText());
                System.out.println("Last name : " + nameNode.path("last").asText());
                System.out.println();
            }

            // get contact
            JsonNode contactNode = root.path("contact");
            if (contactNode.isArray() && !contactNode.isMissingNode()) {
                for (JsonNode nodes : contactNode) {
                    String type = nodes.path("type").asText();
                    String ref = nodes.path("ref").asText();
                    System.out.println("Type : " + type);
                    System.out.println("Ref : " + ref);
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
