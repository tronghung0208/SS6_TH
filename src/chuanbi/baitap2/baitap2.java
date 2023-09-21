package chuanbi.baitap2;

public class baitap2 {
    public static void main(String[] args) {
        Student student=new Student(1,"Phan trọng hùng",true,"CTL48",16,"Nghệ an");
        Student student2=new Student(2, "Phan Hùng",false, "CTL48", 18, "Nghệ an");

        System.out.println("hiển thị thông tin của Phan trọng hùng");
        student.display();
        System.out.println("------------------------------");
        System.out.println("hiển thị thông tin của Phanhung");
        student2.display();
    }
}
