package baitap.baitap4;

public class Baitap4 {

        public static void main(String[] args) {
            // Tạo một đối tượng Fan
            Fan myFan = new Fan();

            // Hiển thị thông tin ban đầu của quạt
            System.out.println("Thông tin ban đầu của quạt:");
            System.out.println(myFan);

            // Bật quạt và đặt tốc độ
            myFan.turnOn();
            myFan.setSpeed(Fan.MEDIUM);

            // Đặt bán kính và màu sắc
            myFan.setRadius(7.5);
            myFan.setColor("Red");
//
            // Hiển thị thông tin sau khi cấu hình
            System.out.println("\nThông tin sau khi cấu hình:");
            System.out.println(myFan);
//
            // Tắt quạt
            myFan.turnOff();
//
            // Hiển thị thông tin sau khi tắt
            System.out.println("\nThông tin sau khi tắt quạt:");
            System.out.println(myFan);
        }
    }
