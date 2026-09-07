package Session8.ex3;

public class MainEx3 {
    public static void main(String[] args) {
        // Tạo các đối tượng hình học
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Square square = new Square(3.0);

        // Thiết lập màu sắc
        circle.setColor("Red");
        rectangle.setColor("Blue");
        square.setColor("Green");

        // In ra màu sắc
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Square color: " + square.getColor());
    }
}