package Java_assignment.unit_4.week_4.Evalution.Question_3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SortSalary implements Comparator<Map.Entry<String,Employee>> {


    @Override
    public int compare(Map.Entry<String, Employee> o1, Map.Entry<String, Employee> o2) {
        return (o1.getValue().getSalary() > o2.getValue().getSalary()) ? +1:-1;

    }


}