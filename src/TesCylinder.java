public class TesCylinder {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder("blue", "filled", 12, 10);
        System.out.println(myCylinder.toString());
        System.out.println();
        System.out.println("The volume of Cylinder is : " + myCylinder.getVolume());
        System.out.println();
        System.out.println("The Area of Cylinder is : " + myCylinder.getArea());
    }
}
