public class Cylinder extends Circle {
    private String color;
    private String filled;
    private double radius;
    private double height;

   public Cylinder(){

   }

    public Cylinder(String color, String filled, double radius, double height) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
        this.height = height;
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
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }

    public double getVolume() {
       return height*radius*radius*Math.PI;
    }

    @Override
    public double getArea() {
        return (super.getArea()*2) + 2*radius*height ;
    }
}

