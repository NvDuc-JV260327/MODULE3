package Session8.ex1;

public class MainEx1 {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];

        animals[0] = new Dog("Bubby", 3, "Golden Retriever");
        animals[1] = new Cat("Whiskers", 2, "Ghi");

        for(Animals animal : animals) {
            animal.displayInfo();
            System.out.println("Âm thanh: " + animal.makeSound());
            System.out.println();
        }
    }
}
