package session7.ex4;

import java.util.Scanner;

public class mainEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] studentArray = new Student[5];

        studentArray[0] = new Student("Alice", 20, "A1", 8.5);
        studentArray[1] = new Student("Bob", 21, "A1", 7.0);
        studentArray[2] = new Student("Charlie", 19, "A2", 9.0);
        studentArray[3] = new Student("David", 22, "A2", 6.5);
        studentArray[4] = new Student("Eve", 20, "A1", 8.0);

        System.out.print("Nhập điểm min: ");
        double min = scanner.nextDouble();
        System.out.print("Nhập điểm max: ");
        double max = scanner.nextDouble();

        for(int i = 0; i < 5; i++) {
            if(studentArray[i].getAvgScore() >= min && studentArray[i].getAvgScore() <= max) {
                System.out.printf("Tên: %s, Tuổi: %d, Lớp: %s, Điểm trung bình: %.1f\n",
                        studentArray[i].getName(), studentArray[i].getAge(),
                        studentArray[i].getStudentClass(), studentArray[i].getAvgScore());
            }
        }
    }
}
