package baitap.baitap5;

public class Employee {
    private int employeeId;
    private String employeeName;

    private int age;
    private double rate;
    private  double salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.rate = rate;
        this.salary=salary();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double salary() {
        return this.rate * 1300000;
    }
    public void displayEmploy(){
        System.out.printf("1.Mã nhân viên: %d ,2.Tên nhân viên: %s ,3.Tuổi: %d ,4.Lương: %.2f \n",this.employeeId,this.employeeName,this.age,this.salary);
    }



}
