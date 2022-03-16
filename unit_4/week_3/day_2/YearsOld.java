package Java_assignment.unit_4.week_3.day_2;

import java.time.LocalDate;
import java.time.Period;

public class YearsOld {

    public static void main(String[] args) {
        LocalDate cDate= LocalDate.now();

        LocalDate dob = LocalDate.of(1999,01,25);

        Period yr = Period.between(cDate,dob);

        System.out.println(yr);
        System.out.println(yr.getDays());
        System.out.println(yr.getMonths());
        System.out.println(yr.getYears());
        System.out.println(yr.toTotalMonths());

    }



}
