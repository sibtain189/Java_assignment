package Java_assignment.unit_4.week_4.day_1.Question_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<String, Student>();

        hm.put("Ramgarh", new Student(101, "Sibtain", 96));
        hm.put("Delhi", new Student(102, "Jitesh", 99));
        hm.put("Lucknow", new Student(103, "Shourabh", 76));
        hm.put("Ranchi", new Student(104, "preeti", 79));

        List<Map.Entry<String, Student>> list = new LinkedList<>(hm.entrySet());

        Collections.sort(list, new MarkComparator<Map.Entry<String, Student>>());

        for (Map.Entry<String, Student> entry : list)
        {
            System.out.println(entry.getKey() + "--------" + entry.getValue());
        }
    }

}