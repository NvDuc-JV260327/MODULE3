package session7.ex4;

public class Student {
    private String name;
    private int age;
    private String studentClass;
    private double avgScore;

    public Student(String name, int age, String studentClass, double avgScore) {
        this.name = name;
        this.age = age;
        this.studentClass = studentClass;
        this.avgScore = avgScore;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentClass() {
        return studentClass;
    }
}
