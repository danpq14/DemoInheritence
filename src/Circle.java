

public class Circle extends Shape {
    private double radius;
    private String color;
    private String filled;

    public Circle(double radius, String color, String filled) {
        super(color,filled);
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getFilled() {
        return filled;
    }

    @Override
    public void setFilled(String filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getParameter() {
        return 2*Math.PI*radius;
    }
}
