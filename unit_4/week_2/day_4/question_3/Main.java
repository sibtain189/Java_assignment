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

        if (provideFood(amount)==new TajHotel()) {
            TajHotel tajHotel = new TajHotel();
            tajHotel.chickenBiryani();
            tajHotel.masalaDosa();
            tajHotel.welcomeDrink();
        }
//        else if(provideFood(amount)==new RoadSideHotel()){
//            RoadSideHotel roadSideHotel = new RoadSideHotel();
//            roadSideHotel.chickenBiryani();
//            roadSideHotel.masalaDosa();
//        }else {
//            System.out.println("Please Enter a valid amount.");
//        }


        //prompt the user to take the amount from the user
        //call the provideFood method on the Main class object by supplying the amount
        //Based on the returned Hotel object call the methods:
        //if the returned object is RoadSideHotel then call the following methods:
//        chickenBiryani();
//        masalaDosa();
        //if the returned object is TajHotel then call the following methods:
//        welcomeDrink();
//        chickenBiryani();
//        masalaDosa();
        //if the returned value is null then show the following message:
//        Please Enter a valid amount.
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