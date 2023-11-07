import java.util.Random;

public class ServerNameGenerator {
    private static String[] adjectives = {
            "awesome", "brave", "clever", "dazzling", "energetic", "fierce", "gracious", "happy", "incredible", "jovial"
    };

    private static String[] nouns = {
            "server", "database", "network", "firewall", "router", "cloud", "protocol", "storage", "security", "monitor"
    };

    public static void main(String[] args) {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        String serverName = adjective + "-" + noun;
        System.out.println("Generated server name: " + serverName);
    }

    public static String getRandomElement(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }


}
