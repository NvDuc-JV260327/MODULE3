package session10.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            String name = InputData.getString(scanner, "Nhập tên sinh viên: ");
            int age = InputData.getInt(scanner, "Nhập tuổi sinh viên: ");
            double avgScore = InputData.getDouble(scanner, "Nhập điểm trung bình: ");

            Student student = new Student(name, age, avgScore);
            manager.addStudent(student);

            continueInput = InputData.getString(scanner, "Bạn có muốn thêm sinh viên khác? (y/n):");
        } while(continueInput.equalsIgnoreCase("y"));

        System.out.println("Danh sách sinh viên: ");
        manager.displayStudents();
        scanner.close();
    }
}
