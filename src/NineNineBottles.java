public class NineNineBottles {
    public static void main(String[] args) {
        String line3 = "take one down pass it around";

        for (int i = 99; i > 0; i--) {
            switch (i) {
                case 1:
                    System.out.println(i + " bottle of beer on the wall");
                    System.out.println(i + " bottle of beer");
                    System.out.println(line3);
                    System.out.println(" no more bottle of beer");
                    break;
                default:
                    System.out.println(i + " bottles of beer on the wall");
                    System.out.println(i + " bottles of beer");
                    System.out.println("take one down pass it around");
                    System.out.println(i - 1 + " bottles of beer on the wall");
            }
        }
    }
}