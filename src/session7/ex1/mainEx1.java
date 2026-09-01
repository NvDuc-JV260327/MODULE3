package session7.ex1;

public class mainEx1 {
    public static void main(String[] args) {
        // tạo Rectangle
        Rectangle r1 = new Rectangle();
        System.out.println("Hình chữ nhật 1: ");
        r1.display();
        System.out.println();

        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("Hình chữ nhật 2: ");
        r2.display();
    }
}
