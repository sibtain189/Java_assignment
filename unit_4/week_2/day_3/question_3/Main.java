package Java_assignment.unit_4.week_2.day_3.question_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        int rollNum = sc.nextInt();
        String name = sc.next();
        int marks = sc.nextInt();

        Student student = new Student(rollNum,name,marks);
        Student student1 = new Student();

        System.out.println("scanner roll number: "+student.getRollNumber());
        System.out.println("scanner roll name: "+student.getStudentName());
        System.out.println("scanner roll marks: "+student.getMarks());

        student1.setMarks(45);
        student1.setStudentName("Flana");
        student1.setRollNumber(10001);

        System.out.println(student1.getRollNumber());
        System.out.println(student1.getStudentName());
        System.out.println(student1.getMarks());

    }
}
