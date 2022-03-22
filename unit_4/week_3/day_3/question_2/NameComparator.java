package Java_assignment.unit_4.week_3.day_3.question_2;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getProductName().compareTo(o1.getProductName());
    }
}