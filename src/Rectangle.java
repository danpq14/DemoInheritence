public class Rectangle extends Shape {
    private double width;
    private double height;
    private String color;
    private String filled;

    public Rectangle(){

    }

    public Rectangle(double width, double height, String color, String filled) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
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
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", filled='" + filled + '\'' +
                '}';
    }

    public double getArea(){
        return width*height;
    }
    public double getParameter(){
        return width+height+width+height;
    }
}
