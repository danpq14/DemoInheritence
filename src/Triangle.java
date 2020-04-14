public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    private String color;
    private String filled;

    public Triangle(String color, String filled, double side1, double side2, double side3) {
        this.color = color;
        this.filled = filled;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(){

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
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

    public double getParameter(){
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = (side1 + side2 + side3)/2;
        double p2 = p*(p-side1)*(p-side2)*(p-side3);
        return Math.sqrt(p2);
    }

    public boolean isTriangle() {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 >side1) {
            return true;
        }
        else {
            return  false;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
