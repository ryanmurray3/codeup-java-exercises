import java.util.Scanner;
import java.io.*;

public class ConsoleExercises {
    public static void main(String[] args) {

//
//        double pi = 3.14159;
//        System.out.format("%-10.2f%n", pi);
//        System.out.println("Enter an integer...");

//        Scanner in = new Scanner(System.in);
//        int numVariable = in.nextInt();
//        System.out.println("Enter in 3 words (hit return after each word: ");
//        Scanner scanner = new Scanner(System.in);
//        String userInput1 = scanner.nextLine();
//        String userInput2 = scanner.nextLine();
//        String userInput3 = scanner.nextLine();
//        System.out.println("You entered: ");
//        System.out.println(userInput1);
//        System.out.println(userInput2);
//        System.out.println(userInput3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length of the room: ");
        float length = scanner.nextFloat();
        System.out.println("Please enter the height of the room: ");
        float width = scanner.nextFloat();

        System.out.println("Length: " + length);
        System.out.println("Width " + width);
        System.out.println(length * width + " is the area of the room");
        System.out.println(2*length + 2*width + " is the perimeter of the room");






    }
}
