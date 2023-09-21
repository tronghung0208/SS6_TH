package chuanbi.baitap2;

public class Student {
    int studentId;
    String studentName;
    boolean sex;
    String className;
    int age;
    String address;
    public Student() {
        super();
    }
    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("MA HS"+studentId+"\n"
                +"Tên HS"+studentName+"\n"
                +"Gioi tính"+age+"\n"
                +"Địa chỉ"+address
        );
    }
}
