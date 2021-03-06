package Java_assignment.unit_4.week_2.day_4.question_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public ArrayList<Integer> findAndReturnPrimeNumbers(int[] inputArray) {

        ArrayList<Integer> arr2 = new ArrayList<>();
//        ArrayList<String> arr3 = new ArrayList<>();

        for (int j = 0; j < inputArray.length; j++) {
            boolean isPrime = false;
            for (int i = 2; i < inputArray[j]; i++) {
                if (inputArray[j] % i == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime == false) {
                arr2.add(inputArray[j]);
            }
        }

        if (arr2.size() == 0) {
            return null;
        } else {
            return arr2;
        }
    }


    public static void main(String[] args) {

        Main main = new Main();

        int[] arr = {10,12,5,50,11,14,15};

        if (main.findAndReturnPrimeNumbers(arr) == null) {
            System.out.println("Prime number not found in the supplied Array");
        } else {
            System.out.println(main.findAndReturnPrimeNumbers(arr));
        }

        System.out.println("Added to the Github");

    }
}