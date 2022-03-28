package Java_assignment.unit_4.week_4.Evalution.Question_3;

import java.util.*;

public class Main {

    public Map<String,Employee> getSortedMapWithValue(Map<String,Employee> originalMap){

        Set<Map.Entry<String,Employee>> mapEmployees = originalMap.entrySet();
        List<Map.Entry<String,Employee>> list = new ArrayList<>(mapEmployees);

        list.sort(new SortSalary());

        LinkedHashMap<String,Employee> linked = new LinkedHashMap<>();

        for (Map.Entry<String,Employee> employee: list) {
            linked.put(employee.getKey(),employee.getValue());
        }


        return linked;
    }

    public static void main(String[] args) {

        HashMap<String ,Employee> hashMap = new HashMap<>();

        hashMap.put("HR",new Employee("1234","Flana",30000.00));
        hashMap.put("Sales",new Employee("2345","Dhimkana",35000.00));
        hashMap.put("Marketing",new Employee("3456","Adrak",45000.00));
        hashMap.put("Accounts",new Employee("4567","Lahsoon",50000.00));

        Main m1 = new Main();

        Map<String,Employee> result = m1.getSortedMapWithValue(hashMap);
        Set<Map.Entry<String,Employee>> mapEntry = result.entrySet();
        for (Map.Entry<String, Employee> set: mapEntry) {
            System.out.println("Department Name : " + set.getKey());
            System.out.println("Employee Details : " + set.getValue());
        }
    }
}
