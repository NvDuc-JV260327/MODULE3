package Demo;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Colorable rectangle = new Rectangle();
        Colorable square = new Square();

        circle.setColor("Blue");
        System.out.println(circle.getColor());
    }
}
