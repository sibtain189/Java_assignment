package Java_assignment.unit_4.week_3.day_2.Demo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EligibleForVote {

    public static void main(String[] args) {
        LocalDate cDate= LocalDate.now();

        LocalDate dob = LocalDate.of(2007,1,17);
        Scanner sc = new Scanner(System.in);

        String dobS = sc.next();

        LocalDate d1 = LocalDate.parse(dobS, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        Period period = Period.between(d1,cDate);

        System.out.println(period);
        System.out.println();

        int ele = period.getYears();

        if(ele>=18){
            System.out.println("Eligible for Vote");
        }else{
            System.out.println("Not Eligible for Vote");
        }


    }
}
