package baitap.baitap6;

import java.util.Scanner;

public class Student {
    private int studentID;
    private String name;
    private int age;

    private boolean gender = false;

    private String address;

    public Student() {
    }

    public Student(int studentID, String name, int age, boolean gender, String address) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;

    }

    public Student(String name, int age, boolean gender, String address) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public void inputData(Scanner sc) {
        System.out.println("ID: ");
        studentID = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Enter age: ");
        age=Integer.parseInt(sc.nextLine());
        System.out.println("Enter gender: ");
        boolean check =true;
        while (check){
            String sex =sc.nextLine();
            if (sex.equals("nam")){
                gender=true;
                check=false;
            }else if (sex.equals("nu")) {
                gender=false;
                check=false;


            }else {
                System.out.println("Nhập lại giới tính");
            }
        }
        System.out.println("Enter address");
        address=sc.nextLine();
    }

    public void getStudent(){
        System.out.printf("Mã họ sinh: %d, Tên học sinh: %s,Tuổi: %d, Giới tính: %s, Địa chỉ: %s \n" ,
                studentID, name,age,gender?"Nam":"Nữ",address);
    }



}
