import java.util.Scanner;

public class diceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides on the dice you want to roll...");
        int numSides = scanner.nextInt();

        boolean rollAgain = true;
        while (rollAgain) {
            int dice1 = rollDice(numSides);
            int dice2 = rollDice(numSides);

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);

            System.out.println("Do you want to roll the dice again yes/no : ");
            String answer = scanner.next();

            rollAgain = answer.equalsIgnoreCase("yes");

        }
        scanner.close();
    }
    public static int rollDice(int numSides) {
        return(int) (Math.random() * numSides) + 1;
    }
}
