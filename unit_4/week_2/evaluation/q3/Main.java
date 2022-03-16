package Java_assignment.unit_4.week_2.evaluation.q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a= sc.nextLine();

        String[] arr = a.split(" ");

        System.out.println(printNum(arr));

    }

    private static String printNum(String[] arr) {
        int s = Integer.parseInt(arr[0]);
        int e = Integer.parseInt(arr[1]);
        int i= Integer.parseInt(arr[2]);

        if(i>0 && s<e){
            String storeNum="";
            for(int j=s; j<=e; j = j+i){
                storeNum += j+" ";
            }

            return storeNum;
        }else {
            return "Error";
        }

    }
}
