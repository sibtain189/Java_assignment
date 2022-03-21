package Java_assignment.unit_4.week_3.evalution.Question_3;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Employee> treeSet = new TreeSet<>();

        boolean flag = true;

        Scanner sc = new Scanner(System.in);

        while (flag) {

            System.out.println("employee id");
            int empId = sc.nextInt();

            System.out.println("employee name");
            String empName = sc.next();

            System.out.println("employee salary");
            double empSalary = sc.nextDouble();

            System.out.println("employee address");
            String empAddress = sc.next();

            Employee employee = new Employee(empId, empSalary, empName, empAddress);
            treeSet.add(employee);

            System.out.println("want to continue? (y/n)");

            String confirm = sc.next();

            if (confirm.equalsIgnoreCase("n")) {
                flag = false;
            }
        }

        for (Employee emp : treeSet) {
            System.out.println("employee id : " + emp.getEmpId());
            System.out.println("employee Name : " + emp.getName());
            System.out.println("employee salary : " + emp.getSalary());
            System.out.println("employee address : " + emp.getAddress());
            System.out.println("====================================================");

        }

    }
}
