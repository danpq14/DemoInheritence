public class Test {
    public static void main(String[] args) {
        Shape myShape = new Shape("black","non-filled");
        Circle myCircle = new Circle(10,"red","filled");
        Rectangle myRectangle = new Rectangle(15,12,"blue","non-filled");

        System.out.println(myShape.toString());
        System.out.println();

        System.out.println(myCircle.toString());
        System.out.println();

        System.out.println(myRectangle.toString());
        System.out.println();

        System.out.println(myCircle.getColor());

    }
}
