package com.internal.Archieved.Practise.ArrayProblems;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

public class ProgramToParseJsonString {


    public static void main(String[] args) {
        String jsonString =
                "[\n" + "{\"name\": \"Ram\",\n" + "\"Address\": [\n" + "\n" + "{\n" + "\t\"type\":\"home\",\n" + "\t\"addressLine\": \"123 home address\"\n" + "},\n" + "{\n" + "\"type\":\"office\",\n"
                        + "\t\"addressLine\": \"456 office address\"\n" + "}\n" + "\n" + "]\n" + "},{\"name\": \"sham\",\n" + "\"Address\": [\n" + "\n" + "{\n" + "\t\"type\":\"home\",\n"
                        + "\t\"addressLine\": \"sham home address\"\n" + "},\n" + "{\n" + "\"type\":\"office\",\n" + "\t\"addressLine\": \"456 office address\"\n" + "}\n" + "\n" + "]\n" + "}\n" + "\n" + "]";
        try {
            // Parse the JSON array string
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(jsonString);
            ArrayList<String> addressLines = new ArrayList<>();
            // Find a specific JSONObject based on criteria (e.g., "id" = 2)
            JSONObject desiredObject = null;
            for (Object obj : jsonArray) {
                if (obj instanceof JSONObject) {
                    JSONArray addresses = (JSONArray) ((JSONObject) obj).get("Address");
                    String addressLine = (String) addresses.stream().filter(type -> ((JSONObject) type).get("type").toString().equals("home")).map(addres -> ((JSONObject) addres).get("addressLine")).findFirst().get();
                    addressLines.add(addressLine);
                    /*if(((JSONObject) obj).get("name").toString().equals("Bob")){
                        desiredObject = (JSONObject) obj;
                        break;
                    }*/
                }
            }
            // Check if the desired object was found
            if (!addressLines.isEmpty()) {
                System.out.println("Desired Object: " + addressLines);
            } else {
                System.out.println("Desired Object not found.");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
