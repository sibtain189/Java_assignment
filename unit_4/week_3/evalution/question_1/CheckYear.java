package Java_assignment.unit_4.week_3.evalution.question_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CheckYear {

    double livedYear(String birth) throws InvalidAge {

        boolean rightDate = birth.matches("^\\d{2}-\\d{2}-\\d{4}");
        if(!rightDate)
            throw new InvalidAge("Please pass the date in proper format");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dateEnteredInFormat = LocalDate.parse(birth, dtf);
        LocalDate today = LocalDate.now();

        long liveExperience = ChronoUnit.YEARS.between(dateEnteredInFormat,today);
        if(liveExperience<0)
            throw new InvalidAge("Age should not be in Future");
        else {
            return liveExperience;
        }

    }
}

class InvalidAge extends Exception {

    public InvalidAge(String message) {
        super(message);
    }
}