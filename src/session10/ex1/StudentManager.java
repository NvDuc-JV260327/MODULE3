package session10.ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentManager {
    private ArrayList <Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        if(students.isEmpty()) {
            System.out.println("Chưa có sinh viên nào trong danh sách!");
        } else {
            for(Student student : students) {
                System.out.println(student);
            }
        }
    }
}
