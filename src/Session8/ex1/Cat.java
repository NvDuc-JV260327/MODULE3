package Session8.ex1;

public class Cat extends Animals {
    private String furColor;

    // contructor
    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    // ghi đè displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Màu lông: " + furColor);
    }

    // ghi đè makeSound
    @Override
    public String makeSound() {
        return "Meow Meow";
    }
}
