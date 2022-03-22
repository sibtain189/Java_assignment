package Java_assignment.unit_4.week_4.day_1.Question_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("Jharkhand", "ranchi");
        map.put("WB", "Kolkata");
        map.put("karnataka", "bangalore");

        for(Map.Entry<String, String> entry:map.entrySet()) {
            System.out.println(entry.getKey() + " ----------> " + entry.getValue());
        }
    }
}