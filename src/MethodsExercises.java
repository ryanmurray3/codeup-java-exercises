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
                return a/b;
            }

            public static int modulus(int a, int b) {
                return a % b;
            }

        public static void main(String[] args) {

            System.out.println((addition(5, 3)));
            System.out.println((subtraction(22, 4)));
            System.out.println(multiplication(3, 55));
            System.out.println(division(44, 33));
            System.out.println(modulus(15, 3));
            System.out.println(modulus(15, 4));

    }

}
