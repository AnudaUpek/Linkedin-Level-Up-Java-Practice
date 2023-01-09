package com.linkedin.javacodechallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    
    private static final List<String> c = null;

    public static List<String> findStudentsWithIncompleteVolunteerEvents(
            List<String> students,
            Map<String, List<String>> attendeesMapping) {
        // TODO: implement function
        List<String> c = new ArrayList<>();
        for(String i : students){
            int count = 0;                        
            for(var j : attendeesMapping.entrySet()){
                for(String k : j.getValue()){
                    if(i.equals(k)){
                        count++;
                    }
                }                
            }
            if(count<2){
                c.add(i);
            }
        }        
        return c;
    }

    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly",
                "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Sally", "Polly"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakfast", List.of("Polly", "Molly"));

        System.out.println(findStudentsWithIncompleteVolunteerEvents(
                students, attendeesMapping));
    }

}
