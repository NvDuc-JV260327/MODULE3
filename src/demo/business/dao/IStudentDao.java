package session13.business.dao;

import session13.business.model.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> getAllStudent();
    Student findById(Integer id);
    void addStudent(Student student);
    void editStudent(Student student);
    void deleteById(Integer id);
}
