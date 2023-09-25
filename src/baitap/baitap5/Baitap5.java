package baitap.baitap5;

import java.util.Arrays;

public class Baitap5 {
    static Employee[] employees = new Employee[100];
    static int employeeId;

    static String employeeName;

    static int age;
    static double rate;
    static double salary = rate * 1300000;

    public static void main(String[] args) {
        Employee employees1 = new Employee(1, "Phan Hùng", 10, 2.3);
        Employee employees2 = new Employee(2, "Trọng Hùng", 11, 2.0);
        Employee employees3 = new Employee(3, "Hùng Phan", 12, 1.3);
        Employee employees4 = new Employee(4, "Hùng Trọng", 13, 3.1);
        Employee employees5 = new Employee(5, "Hùng", 14, 2.8);
        employees[0]=employees1;
        employees[1]=employees2;
        employees[2]=employees3;
        employees[3]=employees4;
        employees[4]=employees5;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null){
                employees[i].displayEmploy();
            }else {
                break;
            }
        }

    }
}
