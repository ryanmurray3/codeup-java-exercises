package shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            scanner.nextLine();

            Circle circle = new Circle(radius);

            System.out.println("Circumference: " + circle.getCircumference());
            System.out.println("Area: " + circle.getArea());

            System.out.print("Do you want to create another circle? (yes/no): ");
            response = scanner.nextLine();
        } while (response.equalsIgnoreCase("yes"));

        scanner.close();

        System.out.println("Total number of circles created: " + Circle.getTotalCircles());
    }
}



