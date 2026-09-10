package Demo;

public class Circle implements Colorable {
    private String color;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
}
