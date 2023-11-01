import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Integer i = 4;
//        while(i <= 14){
//            System.out.print(i + 1 +" ");
//            i++;
//        }
        int i = 0;
        do {
            System.out.print(i + " ");
            i+=2;
        } while (i < 101);
    }
}
