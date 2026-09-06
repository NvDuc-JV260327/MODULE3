package Session8.ex1;

public class Dog extends Animals {
    private String breed;

    // contructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // ghi đè makeSound
    @Override
    public String makeSound() {
        return "Woof Woof";
    }

    // ghi đè displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giống chó: " + breed);
    }
}
