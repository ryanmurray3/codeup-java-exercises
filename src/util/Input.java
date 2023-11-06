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

        public String getString (String prompt) {
            System.out.println(prompt);
            return this.scanner.nextLine();
        }

        public boolean yesNo () {
            String input = this.scanner.nextLine();
            return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
        }

        public boolean yesNo(String prompt) {
            System.out.println(prompt);
            String input = this.scanner.nextLine();
            return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
        }
        public int getInt ( int min, int max){
            int input;
            do {
                System.out.println("Enter an integer between " + min + " and " + ": ");
                input = this.scanner.nextInt();
            } while (input < min || input > max);

            return input;
        }

        public int getInt(int min, int max, String prompt) {
            System.out.println(prompt);
            int input;
            do {
                input = this.scanner.nextInt();
            } while (input < min || input > max);
            return input;
        }

        public double getDouble(double min, double max) {
        double input;

            do {
                System.out.println("Enter a double between " + min + " and " + max + ": ");
                input = this.scanner.nextDouble();
            } while (input < min || input > max);

            return input;
        }

        public double getDouble(double min, double max, String prompt) {
            System.out.println(prompt);
            double input;
            do {
                input = this.scanner.nextDouble();
            } while (input < min || input > max);
            return input;
        }
        public double getDouble () {
                System.out.println("Enter a double: ");
                return this.scanner.nextDouble();
            }
        public double getDouble(String prompt) {
            System.out.println(prompt);
            return this.scanner.nextDouble();
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


//        public static void main(String[] args) {
//        Input input = new Input();
//
//        System.out.println("Please enter a string: ");
//        String stringInput = input.getString();
//        System.out.println("You entered: " + stringInput);
//
//        System.out.println("Please enter yes or no: ");
//        boolean yesNoInput = input.yesNo();
//        System.out.println("You entered: " + (yesNoInput ? "yes" : "no"));
//
//        System.out.println("Please enter an integer between 1 and 10: ");
//        int intInput = input.getInt(1, 10);
//        System.out.println("You entered: " + intInput);
//
//        System.out.println("Please enter a number between 1.0 and 10.0: ");
//        double doubleInput = input.getDouble(1.0, 10.0);
//        System.out.println("You entered: " + doubleInput);
//    }

}

