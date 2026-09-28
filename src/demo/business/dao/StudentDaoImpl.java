package session13.business.dao;

import session13.business.model.Student;
import session13.utils.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements IStudentDao{
    @Override
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();

        Connection conn = ConnectionDB.openConnection();

        try {
            CallableStatement call = conn.prepareCall("{call get_all_students}");

            ResultSet rs = call.executeQuery();

            while (rs.next()) {
                Student student = new Student();
                    student.setId(rs.getInt("id"));
                    student.setFullName(rs.getString("full_name"));
                    student.setEmail(rs.getString("email"));
                    student.setPhone(rs.getString("phone"));
                    student.setAddress(rs.getString("address"));
                    student.setStatus(rs.getBoolean("sex"));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn);
        }
        return students;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void editStudent(Student student) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
