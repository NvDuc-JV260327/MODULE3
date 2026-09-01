package session7.ex1;

import java.security.PrivateKey;

public class Rectangle {
    // thuộc tính
    private double length;
    private double width;

    // contructor mặc định
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // contructor có tham số
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // phương thức tính diện tích
    public double getArea() {
        return length * width;
    }

    // phương thức tính chu vi
    public double getPerimeter() {
        return (length + width) * 2;
    }

    // hiển thị ra màn hình
    public void display() {
        System.out.printf("Chiều dài: %.1f\n", length);
        System.out.printf("Chiều rộng: %.1f\n", width);
        System.out.printf("Chu vi: %.1f\n", getPerimeter());
        System.out.printf("Diện tích: %.1f\n", getArea());
    }
}
