package Java_assignment.unit_4.week_2.evaluation.q2;

import java.util.Scanner;

public class StringManipulator {

    public String removeVowels(String input)
    {
        String demo ="";

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u'){
                continue;
            }else {
                demo += input.charAt(i);
            }
        }
        return demo;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        StringManipulator stringManipulator = new StringManipulator();
        String ans = stringManipulator.removeVowels(word);

        System.out.println(ans);
    }
}
