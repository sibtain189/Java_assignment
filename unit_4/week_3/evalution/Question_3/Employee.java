package Java_assignment.unit_4.week_3.evalution.Question_3;

public class Employee implements Comparable<Employee>{

    private int empId;
    private double salary;
    private String name, address;

    public Employee(int empId, double salary, String name, String address) {
        this.empId = empId;
        this.salary = salary;
        this.name = name;
        this.address = address;
    }

    public Employee() {

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public int compareTo(Employee o) {
        if(this.salary<o.getSalary()){
            return 1;
        }else if(this.salary>o.getSalary()){
            return -1;
        }else {
            return 0;
        }
    }
}
