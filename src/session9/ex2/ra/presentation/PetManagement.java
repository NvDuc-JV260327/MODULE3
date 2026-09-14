package session9.ex2.ra.presentation;

import session9.ex2.ra.entity.Cat;
import session9.ex2.ra.entity.Dog;
import session9.ex2.ra.entity.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class PetManagement {

    public static ArrayList<Pet> petList = new ArrayList<>();

    public static void displayPets() {
        if (petList.isEmpty()) {
            System.out.println("Danh sách trống");
            return;
        }

        for (Pet pet : petList) {
            pet.displayData();
        }
    }

    public static void addPet(Scanner scanner) {

        int choice;

        do {
            System.out.println("1. Thêm chó");
            System.out.println("2. Thêm mèo");
            System.out.print("Lựa chọn: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Dog dog = new Dog();
                    dog.inputData(scanner, petList);
                    petList.add(dog);
                    System.out.println("Thêm chó thành công");
                    break;

                case 2:
                    Cat cat = new Cat();
                    cat.inputData(scanner, petList);
                    petList.add(cat);
                    System.out.println("Thêm mèo thành công");
                    break;

                default:
                    System.out.println("Chọn từ 1-2");
            }

        } while (choice < 1 || choice > 2);
    }

    public static void callSpeak() {

        if (petList.isEmpty()) {
            System.out.println("Danh sách trống");
            return;
        }

        for (Pet pet : petList) {
            System.out.print(pet.getPetName() + ": ");
            pet.speak();
        }
    }

    public static void deletePet(Scanner scanner) {

        System.out.print("Nhập mã thú cưng cần xóa: ");
        String petId = scanner.nextLine();

        for (int i = 0; i < petList.size(); i++) {
            if (petList.get(i).getPetId().equalsIgnoreCase(petId)) {
                petList.remove(i);
                System.out.println("Xóa thành công");
                return;
            }
        }

        System.out.println("Không tìm thấy thú cưng");
    }

    public static void searchPetByName(Scanner scanner) {

        System.out.print("Nhập tên cần tìm: ");
        String keyword = scanner.nextLine();

        boolean found = false;

        for (Pet pet : petList) {
            if (pet.getPetName().toLowerCase()
                    .contains(keyword.toLowerCase())) {

                pet.displayData();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n*********************QUẢN LÝ THÚ CƯNG********************");
            System.out.println("1. Hiển thị danh sách thú cưng");
            System.out.println("2. Thêm thú cưng");
            System.out.println("3. Gọi tiếng kêu");
            System.out.println("4. Xóa thú cưng");
            System.out.println("5. Tìm thú cưng theo tên");
            System.out.println("6. Thoát");

            System.out.print("Lựa chọn của bạn: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        displayPets();
                        break;

                    case 2:
                        addPet(scanner);
                        break;

                    case 3:
                        callSpeak();
                        break;

                    case 4:
                        deletePet(scanner);
                        break;

                    case 5:
                        searchPetByName(scanner);
                        break;

                    case 6:
                        System.exit(0);

                    default:
                        System.out.println("Chọn từ 1-6");
                }

            } catch (Exception e) {
                System.out.println("Vui lòng nhập số");
            }

        } while (true);
    }
}
