package Java_assignment.unit_4.week_4.Evalution.Question_2;

import java.io.*;
import java.nio.file.FileSystemAlreadyExistsException;

public class Main {

    public static void main(String[] args) {

        try {

            Employee employee = new Employee("1234", "Flana", "flana@gmail.com", "12345",
                    new Address("Jharkhand", "Ramgarh", "829117"));

            FileOutputStream empFile = new FileOutputStream("emp.txt");
            ObjectOutputStream exeFile = new ObjectOutputStream(empFile);
            exeFile.writeObject(employee);

            exeFile.flush();
            exeFile.close();

            System.out.println("file saved");
            System.out.println("employee id : " + employee.empId);
            System.out.println("employee id : " + employee.empName);
            System.out.println("employee id : " + employee.email);
            System.out.println("employee id : " + employee.password);
            System.out.println("employee id : " + employee.adress);
//
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {

            FileInputStream inputStream = new FileInputStream("emp.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            Object obj = objectInputStream.readObject();

            Employee employee = (Employee) obj;

            employee.funA();

//            String readObj = (String) objectInputStream.readObject();
//
//            String values = (String) objectInputStream.readObject();

            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
