package luyentap.ra.book;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private boolean status;

    public Book() {
    }

    public Book(int bookId, String bookName, float importPrice, float exportPrice, String author, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.status = status;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(Scanner sc) {
        System.out.println("Nhập bookId: ");
        this.bookId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sách");
        this.bookName = sc.nextLine();
        System.out.println("Nhập giá sách nhập vào");
        this.importPrice =Float.parseFloat( sc.nextLine());

        System.out.println("Nhập tên tác giả");
        this.author = sc.nextLine();
        System.out.println("Nhập trạng thái");
        this.status =Boolean.parseBoolean( sc.nextLine());
    }

    public void displayData() {
        System.out.printf("1.Mã sách%s: , 2.Tên sách%s: ,3.Giá nhập%f: ,4.Tên tác giả%s: ,5.Trạng thái%b \n: ", this.bookId, this.bookName, this.importPrice, this.author, this.status);
    }


}
