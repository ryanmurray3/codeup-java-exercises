import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleIoLecture {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);
        System.out.println("Type in your name...");
        String userName = scanner.nextLine();
        System.out.printf("Hi, %s", userName);
    }

}
//upper case letter is the class, and the lower case is for the object instance...a class defines properties and methods

//    Scanner scanner = new Scanner(System.in);
//
//System.out.print("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//