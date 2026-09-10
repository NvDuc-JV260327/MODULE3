package Demo;

public class Square implements Colorable {
    private String color;
    private double length;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }
}
