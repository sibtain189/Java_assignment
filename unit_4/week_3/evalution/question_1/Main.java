package Java_assignment.unit_4.week_3.evalution.question_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dob= sc.next();

        CheckYear checkYear = new CheckYear();

        try{
            double ageVarify= checkYear.livedYear(dob);
            System.out.println("Age is " + ageVarify);
        }
        catch (InvalidAge e){
            System.out.println(e.getMessage());
        }


    }
}