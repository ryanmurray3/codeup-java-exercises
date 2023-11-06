import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Integer i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        int i = 100;
//        do {
//            System.out.print(i + " ");
//            i-=5;
//        } while (i >= -10);

//        int i = 1;
//        do {
//            System.out.println(i + 1);
//            i++;
//        } while (i < 100);


//        int squareCounter = 2;
//        do {
//            System.out.println(squareCounter);
//            squareCounter = (int) Math.pow(squareCounter, 2);
//        } while (squareCounter <= 1000000);
//
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizz Buzz");
//            }
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
//}
        String userChoice;
        do {
            System.out.println("Enter an integer:");
            int userInteger = Integer.parseInt(scanner.nextLine());
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userInteger; i++) {
                System.out.printf("%-7d| %-8d| %d %n", i, i * i, i * i * i);
            }
            System.out.println("Do you want to continue?");
            userChoice = scanner.nextLine().toLowerCase();
        } while (userChoice.equals("y") || userChoice.equals("yes"));
    }
}



//        String userChoice;
//        do {
//            System.out.println("Enter a numeric grade between 0 and 100");
//            int grade = Integer.parseInt(scanner.nextLine());
//            char letterGrade;
//            if (grade < 60) {
//                letterGrade = 'F';
//                System.out.println("You have a: " + letterGrade);
//            } else if (grade < 70) {
//                letterGrade = 'D';
//                System.out.println("You have a: " + letterGrade);
//            } else if (grade < 80) {
//                letterGrade = 'C';
//                System.out.println("You have a: " + letterGrade);
//            } else if (grade < 90) {
//                letterGrade = 'B';
//                System.out.println("You have a: " + letterGrade);
//            } else if (grade <= 100) {
//                letterGrade = 'A';
//                System.out.println("You have a: " + letterGrade);
//            }
//            System.out.println("Do you want to continue?");
//            userChoice = scanner.nextLine().toLowerCase();
//        } while (userChoice.equals("yes") || userChoice.equals("y"));
//    }
//}