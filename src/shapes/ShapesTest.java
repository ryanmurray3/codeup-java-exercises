package shapes;

public class ShapesTest {



    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Rectangle box1:");
        System.out.println("Perimeter: " + box1.getPerimeter());
        System.out.println("Area: " + box1.getArea());

        Square box2 = new Square(5);
        System.out.println("Square box2: ");
        System.out.println("Perimeter: " + box2.getPerimeter());
        System.out.println("Area: " + box2.getArea());
    }
}
