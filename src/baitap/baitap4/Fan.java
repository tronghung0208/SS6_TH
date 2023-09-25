package baitap.baitap4;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public Fan(){
        this.speed=SLOW;
        this.on=false;
        this.radius=5.0;
        this.color="blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Phương thức để bật quạt
    public void turnOn() {
        this.on = true;
    }

    // Phương thức để tắt quạt
    public void turnOff() {
        this.on = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    public String toString() {
        String status = on ? "bật" : "tắt";


        return "Quạt có: "+"\n Tốc độ " +this.speed + "\n Bán kính " + this.radius + "\n Màu " + this.color + "\n hiện đang " + status;
    }
}
