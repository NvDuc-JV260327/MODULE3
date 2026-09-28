package session13;

import session13.business.dao.IStudentDao;
import session13.business.dao.StudentDaoImpl;
import session13.business.model.Student;
import session13.utils.ConnectionDB;

import java.sql.Connection;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        List<Student> students = studentDao.getAllStudent();
        students.forEach(System.out::println);
    }
}
