package luyentap.ra;

import java.util.Scanner;

public class Student {
    /*
     * Xây dựng lớp sinh viên gồm:
     * 1. các đặc điểm: mã sinh viên, tên, tuổi, giới tính, địa chỉ, trạng thái
     * 2. gồm 2 contructor: default và khởi tạo tất cả các thông tin sinh viên
     * 3. các phương thức getter/setter cho phép truy cập các thuộc tính
     * 4. xây dựng các hành vi
     *  - chào giảng viên
     *  - tính ổng 2 số
     *  - Nhập thông tin cho Sv
     *  - hiển thị thông tin sinh viên
     */

    // Atribute/ fields

    private String studentId;
    private String name;
    private int age;
    private boolean sex;

    private String address;
    private String status;

    public Student() {
    }
    public Student(String studentId, String name,int age, boolean sex, String address, String status) {
    }
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public  void hello(){
        System.out.println("Xin Chào");
    }

    public int subTwoNumbers(int nunber1, int number2){
        int sum=number2+nunber1;
        return sum;
    }
    public void inputData(Scanner sc){
        System.out.println("Nhập vào mã sv");
        this.studentId=sc.nextLine();
        System.out.println("Nhập tên sv");
        this.name=sc.nextLine();
        System.out.println("Nhập tuổi");
        this.age=sc.nextInt();
        System.out.println("Nhập giới tính");
        this.sex=Boolean.parseBoolean(sc.nextLine());

        System.out.println("Nhập vào địa chỉ");
        this.address=sc.nextLine();


    }
}
