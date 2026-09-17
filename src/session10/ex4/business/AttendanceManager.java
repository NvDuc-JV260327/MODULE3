package session10.ex4.business;

import session10.ex4.entity.Student;
import session10.ex4.presentation.Manage;

import java.util.ArrayList;

public class AttendanceManager implements Manage<Student> {
    public ArrayList<Student> students;

    public AttendanceManager() {
        students = new ArrayList<>();
    }

    @Override
    public void add(Student item) {
        students.add(item);
    }

    @Override
    public void update(int index, Student item) {
        students.set(index, item);
    }

    @Override
    public void delete(int index) {
        students.remove(index);
    }

    @Override
    public void display() {
        if(students.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for(int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }
        }
    }
}
