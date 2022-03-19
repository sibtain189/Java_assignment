package Java_assignment.unit_4.week_3.day_3.question_1;

public class Employees implements Comparable<Employees> {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public Employees() {
    }


    public Employees(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public int compareTo(Employees emp) {
        if (this.employeeSalary < emp.getEmployeeSalary())
            return 1;
        else if (this.employeeSalary > emp.getEmployeeSalary())
            return -1;
        else
            return 0;
    }


}