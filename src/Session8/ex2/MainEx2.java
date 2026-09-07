package Session8.ex2;

public class MainEx2 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Car và Bike
        Vehicle car = new Car("Toyota", 120);
        Vehicle bike = new Bike("Yamaha", 80);

        // Gọi các phương thức
        car.start();
        car.displayInfo();

        bike.start();
        bike.displayInfo();
    }
}
