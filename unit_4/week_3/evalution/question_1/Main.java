package Java_assignment.unit_4.week_3.evalution.question_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String joiningDate= sc.next();

        EmployeeBonus employeeBonus = new EmployeeBonus();

        try{
            double bonus= employeeBonus.bonusOfExperience(joiningDate);
            System.out.println("Bonus is " + bonus);
        }
        catch (InvalidAge e){
            System.out.println(e.getMessage());
        }


    }
}