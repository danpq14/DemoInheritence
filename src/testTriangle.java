public class testTriangle {
    public static void main(String[] args) {
        Triangle ABC = new Triangle();
        ABC.setSide1(3);
        ABC.setSide2(4);
        ABC.setSide3(5);

        if (ABC.isTriangle()) {
            System.out.println("S=" + ABC.getArea());
            System.out.println("P=" + ABC.getParameter());
            System.out.println(ABC.toString());
        }
        else {
            System.out.println("ABC is not a Triangle");
        }
    }
}
