public class Shape {
    private String color;
    private String filled;

    public Shape(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
            return "This shape has color is "+ this.color + " and filled by "+ this.filled;
    }

}
