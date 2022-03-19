package Java_assignment.unit_4.week_3.day_3.question_1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Employees> treeSet = new TreeSet<>();
        boolean permit = true;


        while (permit) {

            System.out.println("Enter id");
            int employeeId = sc.nextInt();

            System.out.println("Enter name");
            String employeeName = sc.next();

            System.out.println("Enter salary");
            double employeeSalary = sc.nextDouble();

            Employees emp = new Employees(employeeId, employeeName, employeeSalary);
            treeSet.add(emp);

            System.out.println("do you want to continue? (y/n)");
            String check = sc.next();

            if (check.equalsIgnoreCase("n")) {
                permit = false;
            }
        }

        for (Employees sort : treeSet) {
            System.out.print("id : " + sort.getEmployeeId() + ", ");
            System.out.print("name : " + sort.getEmployeeName() + ", ");
            System.out.print("salary : " + sort.getEmployeeSalary());
            System.out.println();
        }
    }
}