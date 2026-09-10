package session9.ra.entity;

import java.util.Scanner;

public class Student {
    // thuộc tính
    private int studentId;
    private String studentName;
    private int studentAge;
    private String specialized;

    // contructor có tham số và không tham số

    public Student(int studentId, String studentName, String specialized, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.specialized = specialized;
        this.studentAge = studentAge;
    }

    public Student() {
    }

    // getter và setter

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // phương thức inputData
    public void inputData(Scanner scanner, int id) {
        setStudentId(id++);
        System.out.print("Nhập tên sinh viên: ");
        setStudentName(scanner.nextLine());
        System.out.print("Nhập tuổi: ");
        setStudentAge(Integer.parseInt(scanner.nextLine()));
        System.out.print("Nhập chuyên ngành: ");
        setSpecialized(scanner.nextLine());
    }

    // phương thức displayData
    public void displayData() {
        System.out.println("Id: " + studentId);
        System.out.println("Tên: " + studentName);
        System.out.println("Tuổi: " + studentAge);
        System.out.println("Chuyên ngành: " + specialized);
    }

}
