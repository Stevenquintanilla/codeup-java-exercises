import java.util.Scanner;

public class Bob {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello! My name is Bob! How may I help you?: ");
        String input = scanner.nextLine();

        if (input.endsWith("?")) {
            System.out.println("lol I dunno :^)");
        } else if (input.endsWith("!")) {
            System.out.print("Woah, chill out");
        } else if (input.equals("")) {
            System.out.println("Fine, be that way!");
        } else {
            System.out.println("Whatever.");
        }

        System.out.println("Welcome to the calculator program!");

        String confirm;
        do {
            System.out.print("Do you wish to continue? y/n ");
            confirm = scanner.next();
            if (confirm.equals("n")) {
                break;
            }

            System.out.println("How many operands will you use?");
        } while(confirm.equals("y"));
    }
}
