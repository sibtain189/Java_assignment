package Java_assignment.unit_4.week_3.day_1.Question_1;

import java.util.InputMismatchException;
import java.util.Scanner;
class Main {

    static String checkNum(int n) throws NullStringException{
        if(n > 10) return "Welcome to Exception Handling";
        else throw new NullStringException("value is null");
    }

    public static void main(String args[]) {
        System.out.println("start of main..");
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        String message = null;
        try{
            System.out.println("Enter num1");
            num1 = sc.nextInt();
            System.out.println("Enter num2");
            num2 = sc.nextInt();
            int num3 = num1 / num2;
            message = checkNum(num3);
            System.out.println("Message is :"+message.toUpperCase());
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("num2 should not be 0");
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("Please enter valid number");
        }
        catch (NullStringException nullStringException){
            System.out.println(nullStringException.getMessage());
        }
        System.out.println("end of main");
    }
}

class NullStringException extends Exception{
    public NullStringException(String message){
        super(message);
    }
}