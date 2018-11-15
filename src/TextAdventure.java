import java.util.Scanner;
public class TextAdventure {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String playerName = scanner.nextLine();

        System.out.println("Welcome to the adventures of:" + playerName + "!" + " " +
                "You are a aspiring code enjoying your weekend! Below is the map where you" +
                "can decide where to go. Where shall you go?");
        System.out.println("");
    }
}
