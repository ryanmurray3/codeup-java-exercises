package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String input = this.scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String input = this.scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.print("Enter an integer between " + min + " and " + max + ": ");
            try {
                input = Integer.parseInt(this.scanner.nextLine());
            } catch (NumberFormatException e) {
                input = min - 1; // Set input to an invalid value to repeat the loop
            }
        } while (input < min || input > max);

        return input;
    }

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        return getInt(min, max);
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.print("Enter a double between " + min + " and " + max + ": ");
            try {
                input = Double.parseDouble(this.scanner.nextLine());
            } catch (NumberFormatException e) {
                input = min - 1; // Set input to an invalid value to repeat the loop
            }
        } while (input < min || input > max);

        return input;
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.print(prompt);
        return getDouble(min, max);
    }

    public double getDouble() {
        System.out.print("Enter a double: ");
        return Double.parseDouble(this.scanner.nextLine());
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return getDouble();
    }

    public static void main(String[] args) {
        Input input = new Input();

        String stringInput = input.getString("Please enter a string: ");
        System.out.println("You entered: " + stringInput);

        boolean yesNoInput = input.yesNo("Please enter yes or no: ");
        System.out.println("You entered: " + (yesNoInput ? "yes" : "no"));

        int intInput = input.getInt(1, 10, "Please enter an integer between 1 and 10: ");
        System.out.println("You entered: " + intInput);

        double doubleInput = input.getDouble(1.0, 10.0, "Please enter a number between 1.0 and 10.0: ");
        System.out.println("You entered: " + doubleInput);
    }
}
