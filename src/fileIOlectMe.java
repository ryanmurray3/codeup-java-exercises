import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class fileIOlectMe {

    public static void main(String[] args) {
        String filename = "info.txt";

        Path pathToFile = Paths.get("info.txt");
        Path pathToData = Paths.get("data/info.txt");
        System.out.println(pathToData);

        List<String> pizzaToppings = Arrays.asList (
                "topping1", "topping2", "topping3", "topping4", "topping5"
        );

        try {
            Files.write(pathToFile, pizzaToppings);
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        }


    }
}
