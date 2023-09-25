package baitap.baitap6;

import java.util.Arrays;
import java.util.Scanner;

public class ListStudent {
    static Student[] students = new Student[100];
    static int studentCount = 4;
    static int studentID;
    static String name;
    static int age;
    static boolean gender;
    static String address;

    public static void main(String[] args) {

//        Student student1 = new Student(1, "Trọng Hùng", 20, true, "Nghệ an");
//        Student student2 = new Student(2, "Phan Hùng", 21, true, "Yên Thành");
//        Student student3 = new Student(3, "Hùng Phan", 22, false, "Yên Thành");
//        Student student4 = new Student(4, "Trọng Phan", 23, true, "Kim Thành");
//        students[0] = student1;
//        students[1] = student2;
//        students[2] = student3;
//        students[3] = student4;
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("----------MENU-----------");

            System.out.println("1.Hiển thị đanh sách tất cả học sinh");
            System.out.println("2.Thêm học sinh mới");
            System.out.println("3.Sửa thông tin học sinh");
            System.out.println("4.Xóa học sinh");
            System.out.println("5.Thoát");
            System.out.println("Hãy nhập lựa chọn của bạn");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    showStudent();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại");
            }
        } while (true);
    }


    public static void showStudent() {
        for (Student student : students
        ) {
            if (student != null) {
                student.getStudent();
            } else {
                break;
            }
        }
    }


    // THÊM MỚI SINH VIÊN
    public static void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin của student");
        System.out.println("Nhập mã học sinh: ");
        studentID = sc.nextInt();
        sc.nextLine();
        boolean isDuplicateId = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getStudentID() == studentID) {

                isDuplicateId = true;
                break;
            }
        }
        if (isDuplicateId) {
            System.out.println("Mã sinh viên đã có trong danh sách");
        } else {
            System.out.println("Nhập tên học sinh: ");
            name = sc.nextLine();

            System.out.println("Nhập tuổi: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập Giới tính: ");
            gender = sc.hasNextBoolean();
            sc.nextLine();
            System.out.println("Nhập địa chỉ: ");
            address = sc.nextLine();

            if (studentCount < students.length) {
                students[studentCount] = new Student(studentID, name, age, gender, address);
                studentCount++;
            } else {
                System.out.println("Danh sách học sinh đã đầy, không thể thêm mới.");
            }
        }
    }

    // Hàm tìm ra vị trí student
    public static int indexStudentUpdate(Student[] students, int studentID) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getStudentID() == studentID) {
                index = i;
                break;
            }
        }
        return index;
    }
 // SỬA THÔNG TIN STUDENT
    public static void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ID học sinh cần sửa");
        int studentIdUpdate = sc.nextInt();
        int indexUpdate = indexStudentUpdate(students, studentIdUpdate);
        if (indexUpdate == -1) {
            System.out.println("Không có sinh viên bạn muốn sửa,xin mời nhập lại");
        } else {
            System.out.println("Lựa chọn loại thông tin muốn sửa:");
            System.out.println("1. Tên học sinh\n2. Tuổi\n3. Giới tính\n4. Địa chỉ\n5. 6. Thoát\n");
            System.out.println("Nhập mục bạn muốn sửa");
            byte choice = sc.nextByte();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhập vào tên mới: ");
                    String newName = sc.nextLine();
                    students[indexUpdate].setName(newName);
                    break;
                case 2:
                    System.out.print("Nhập vào tuổi mới: ");
                    byte newAge = sc.nextByte();
                    sc.nextLine();
                    students[indexUpdate].setAge(newAge);

                    break;
                case 3:
                    System.out.print("Nhập vào giới tính mới (Nhập vào Nam nếu là nam): ");
                    String str = sc.nextLine();
                    boolean newGender = str == "Nam" ? true : false;
                    students[indexUpdate].setGender(newGender);

                    break;
                case 4:
                    System.out.print("Nhập vào địa chỉ mới: ");
                    String newAddress = sc.nextLine();
                    students[indexUpdate].setAddress(newAddress);

                    break;
                case 5:
                    break;
                default:
                    System.out.println("Nhập sai");
            }


        }

    }


    // XÓA STUDENT
    public static void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên bạn muốn xóa");
        int deleteId = sc.nextInt();
        int indexDelete = indexStudentUpdate(students, deleteId);

        if (indexDelete == -1) {
            System.out.println("Mã sinh viên không hợp lệ");
        } else {
            students[indexDelete] = null;
        }
    }

}
