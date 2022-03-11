package Java_assignment.unit_4.week_2.day_4.question_3;

import java.util.Scanner;

public class Main {

    public static Hotel provideFood(int amount) {

        if (amount > 1000) {
            return new TajHotel();
        } else if (amount > 200 && amount <= 1000) {
            return new RoadSideHotel();
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        //create the object of the Main class

        Main main = new Main();

        Scanner sc = new Scanner(System.in);
        //Create the Scanner class object to take the amount from the user

        int amount = sc.nextInt();

//       Hotel a= main.provideFood(amount);

        Hotel hotel = main.provideFood(amount);
        if(hotel == null){
            System.out.println("Please Enter a valid amount");
        }
        else {
            if(hotel instanceof TajHotel){
                TajHotel tajHotel = (TajHotel) hotel;
                tajHotel.welcomeDrink();
                hotel.chickenBiryani();
                hotel.masalaDosa();
            }
            else {
                hotel.chickenBiryani();
                hotel.masalaDosa();
            }
        }
    }
}


class TajHotel implements Hotel {

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Taj Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Taj Hotel");
    }

    public void welcomeDrink() {
        System.out.println("Welcome Drink from the TajHotel");
    }

}

class RoadSideHotel implements Hotel {

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Road Side Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Road Side Hotel");
    }
}