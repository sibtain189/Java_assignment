package Java_assignment.unit_4.week_3.day_2.Question_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EmployeeBonus {

//    LocalDate joinDate;

        double bonusOfExperience(String joinDate) throws InvalidAge {

            boolean rightDate = joinDate.matches("^\\d{2}-\\d{2}-\\d{4}");
            if(!rightDate)
                throw new InvalidAge("Please pass the date in correct format");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate dateEnteredInFormat = LocalDate.parse(joinDate, dtf);
            LocalDate today = LocalDate.now();

            long experience = ChronoUnit.YEARS.between(dateEnteredInFormat,today);
            if(experience<0)
                throw new InvalidAge("Age should not be in Future");

            if(experience<=1){
                return 5000;
            }
            if(experience>1 && experience<=2){
                return 8000;
            }

            return 10000;

        }
}

class InvalidAge extends Exception {

    public InvalidAge(String message) {
        super(message);
    }
}
