package Java_assignment.unit_4.week_4.Evalution.Question_3;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public Map<String, Employee> getSortedMapWithValue(Map<String, Employee> originalMap) {

        return null;
    }

    public static void main(String[] args) {

        Map<String, Employee> map = new HashMap<>();

        map.put("HR", new Employee("1234", "raj", 30000.00));
        map.put("Sales", new Employee("2345", "simran", 35000.00));
        map.put("Marketing", new Employee("3456", "yash", 45000.00));
        map.put("Accounts", new Employee("4567", "babu rao", 50000.00));

        Main main = new Main();
        main.getSortedMapWithValue(map);

    }
}
