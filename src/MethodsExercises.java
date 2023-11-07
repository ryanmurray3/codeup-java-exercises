import java.util.Scanner;

public class MethodsExercises {


    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInput = scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("Invalid input! Please try again.");
            return getInteger(min, max);
        }
        return userInput;
    }

    public static void calculateFactorial () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("Invalid input.  Please enter a number between 1 and 10: ");
            return;
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is " + factorial + ".");
        System.out.println("Do you want to continue? (yes/no): ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")) {
            calculateFactorial();
        }
        scanner.close();
    }


    public static void main(String[] args) {

        System.out.println((addition(5, 3)));
        System.out.println((subtraction(22, 4)));
        System.out.println(multiplication(3, 55));
        System.out.println(division(44, 33));
        System.out.println(modulus(15, 3));
        System.out.println(modulus(15, 4));
        int userInput = getInteger(1, 56);
        System.out.println("User input: " + userInput);

        calculateFactorial();

        }
    }
