public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");


       int myFavoriteNumber = 333;
        System.out.println(myFavoriteNumber);

        String myString = "can be empty? Yes...will it be useful in the future?";
        System.out.println(myString);

        float myNumber = 3;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);
        String myExplainWhy = "The code above works as an increment after the number adding the number by like x + 1...The other code does not work because I am trying to declare a variable in the same scope.  In java I cannot declare a variable with the same name in the same scope.  So, if I comment out the first set of code the ++x code executes.";

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

        int xY = 4;
        x += 5;

        int x = 3;
        int y = 4;
        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

        String problem14 = "If I assign a variable to a numerical variable that is larger or smaller than the type it can hold I receive a red warning of a lossy result.  If I increment a numeric variable past the type's capacity, it results in an overflow." + "the example takes 4 bytes of data.";
    }

}










//all java is in classes and written in upper camel case or Pascal Case
