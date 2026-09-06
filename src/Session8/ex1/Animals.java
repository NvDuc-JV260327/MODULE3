package Session8.ex1;

public class Animals {
    private String name;
    private int age;

    // tạo contructor
    public Animals(String name, int age) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Tên không được để trống");
        }
        if(age < 0) {
            throw new IllegalArgumentException("Tuổi không được âm");
        }
        this.name = name;
        this.age = age;
    }

    // tạo getter và setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Tên không được để trống");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Tuổi không được âm");
        }
        this.age = age;
    }

    // hiển thị thông tin chung
    public void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }

    // hiển thị âm thanh
    public String makeSound() {
        return "Some generic sound";
    }
}
