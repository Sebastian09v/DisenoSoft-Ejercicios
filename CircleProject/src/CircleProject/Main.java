package CircleProject;
public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("Circle 1: " + circle1);
        System.out.println("Area of Circle 1: " + circle1.getArea());

        Circle circle2 = new Circle(2.5, "blue");
        System.out.println("Circle 2: " + circle2);
        System.out.println("Area of Circle 2: " + circle2.getArea());

        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder 1: " + cylinder1);
        System.out.println("Volume of Cylinder 1: " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(3.0, 5.0, "green");
        System.out.println("Cylinder 2: " + cylinder2);
        System.out.println("Volume of Cylinder 2: " + cylinder2.getVolume());
    }
}

