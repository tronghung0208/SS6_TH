package luyentap.ra.book;

import java.util.Scanner;

public class MainBook {

    public static void main(String[] args) {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("--------MENU----------");
            System.out.println("1.Nhập thông tin sách");
            System.out.println("2.Hiển thị thông tin sách");
            System.out.println("3.Tính giá bán sách");
            System.out.println("4.Kiểm tra tên sách");
            System.out.println("5.Thoát");
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {

                case 1:
                    book.inputData(sc);
                    break;
                case 2:
                    book.displayData();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

                default:
                    break;
            }

        } while (true);
    }
}
