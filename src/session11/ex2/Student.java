package session11.ex2;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student() {
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void display() {
        System.out.printf("| Name: %20s | Age: %5d | Grade : %10f |\n", name, age, grade);
    }
}