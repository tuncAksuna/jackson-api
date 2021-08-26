package com.tuncode.jacksonapi;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class TreeModelCRUDOperations {

    public static void main(String[] args) {

        // create,update,delete JSON Nodes,to modify JSON node( I need to convert it to "ObjectNode" )

        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonNode rootNode = mapper.readTree(new File("src/main/resources/user.json"));

            String resultOriginal = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
            System.out.println("Before updating \n " + resultOriginal);

            // update id to 1000 (convert "ObjectNode"):
            ((ObjectNode) rootNode).put("id", 1000);

            // if middle name is empty , update to middle element:
            ObjectNode nameNode = (ObjectNode) rootNode.path("name");
            if ("".equals(nameNode.path("middle").asText())) {
                nameNode.put("middle", "middle element");
            }

            // create a new field in nameNode
            nameNode.put("nickname", "Tall boyyy");

            // remove last name field in nameNode
            nameNode.remove("last");

            // Create a new "ArrayNode" and add to root;
            ArrayNode likedMusicAndCountry = mapper.createArrayNode();

            ObjectNode element1 = mapper.createObjectNode().objectNode();
            element1.put("name", "Aşık Veysel");
            element1.put("country", "Turkey");

            ObjectNode element2 = mapper.createObjectNode().objectNode();
            element2.put("name", "Semiramis Pekkan");
            element2.put("country", "Turkey");

            likedMusicAndCountry.add(element1);
            likedMusicAndCountry.add(element2);
            ((ObjectNode) rootNode).set("likedMusicAndCountry", likedMusicAndCountry);

            String resultUpdate = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
            System.out.println("\n\nAfter updating :\n" + resultUpdate);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
