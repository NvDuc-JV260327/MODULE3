package session9.ex2.ra.entity;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Pet {
    private String petId;
    private String petName;
    private int age;

    public Pet() {
    }

    public Pet(String petId, String petName, int age) {
        this.petId = petId;
        this.petName = petName;
        this.age = age;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inputData(Scanner scanner, ArrayList<Pet> petList) {

        while (true) {
            System.out.print("Nhập mã thú cưng: ");
            String id = scanner.nextLine();

            if (!id.matches("^[CD]\\d{3}$")) {
                System.out.println("Mã phải có dạng C001 hoặc D001");
                continue;
            }

            boolean isExist = false;

            for (Pet pet : petList) {
                if (pet.getPetId().equalsIgnoreCase(id)) {
                    isExist = true;
                    break;
                }
            }

            if (isExist) {
                System.out.println("Mã đã tồn tại");
            } else {
                this.petId = id;
                break;
            }
        }

        while (true) {
            System.out.print("Nhập tên thú cưng: ");
            String name = scanner.nextLine().trim();

            if (name.length() < 20 || name.length() > 50) {
                System.out.println("Tên từ 20-50 ký tự");
            } else {
                this.petName = name;
                break;
            }
        }

        while (true) {
            try {
                System.out.print("Nhập tuổi: ");
                int age = Integer.parseInt(scanner.nextLine());

                if (age <= 0) {
                    throw new IllegalArgumentException("Tuổi phải > 0");
                }

                this.age = age;
                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void displayData() {
        System.out.printf("Mã: %s | Tên: %s | Tuổi: %d%n",
                petId, petName, age);
    }

    public abstract void speak();
}