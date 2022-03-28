package Java_assignment.unit_4.week_4.Evalution.Question_2;

import java.io.Serializable;

public class Employee implements Serializable {

    String empId, empName, email, password;
    Address adress;
//, Address adress


    public Employee(String empId, String empName, String email, String password, Address adress) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.password = password;
        this.adress = adress;
    }

    public void funA(){
        System.out.println("employee id : "+empId);
        System.out.println("employee id : "+email);
        System.out.println("employee id : "+empName);
        System.out.println("employee id : "+adress);
    }
}
