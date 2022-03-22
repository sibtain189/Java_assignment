package Java_assignment.unit_4.week_3.day_3.question_2;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getProductPrice() < o2.getProductPrice())
            return -1;
        else if (o1.getProductPrice() < o2.getProductPrice())
            return 1;
        else
            return 0;
    }
}