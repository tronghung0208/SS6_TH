package chuanbi.baitap4;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator calculator=new Calculator();
        System.out.println("nhập giá trị của a");
        double a=sc.nextInt();
        System.out.println("nhập giá trị cảu b");
        double b=sc.nextDouble();

//	  đặt giá trị cho 2 thuộc tính
        calculator.setA(a);
        calculator.setB(b);


//	 hiện thị phép toán
        System.out.println("Tổng của 2 số là"+calculator.add());
        System.out.println("Hiệu của 2 số là"+calculator.sub());
        System.out.println("Tích của 2 số là"+calculator.multi());
        System.out.println("Thương của 2 số là"+calculator.div());
    }
}
