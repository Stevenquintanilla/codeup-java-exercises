import java.util.Arrays;

public class ServerNameGenerator {

    public static String randomIndex(String[] array) {
        int randomIndex = (int) Math.floor(Math.random() * array.length);
        return array[randomIndex];
    }

    public static void main(String[] args) {
        String[] adjectives = {"calm", "cool", "chill", "nice", "angry", "aggressive",
        "passive", "nonchalant", "menacing", "hyper"};
        String [] nouns = {"person", "squirrel", "giraffe", "hippo", "racoon", "dog",
         "cat", "bird", "horse", "fish"};

        System.out.println(randomIndex(adjectives) + " " + randomIndex(nouns));
    }
}
