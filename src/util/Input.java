package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println();
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("y") ||
                userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInput = scanner.nextInt();
        if(userInput < min || userInput > max) {
            System.out.println("Incorrect value");
            return getInt(min, max);
        } else {
            return userInput;
        }
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userInput = scanner.nextDouble();
        if(userInput < min || userInput > max) {
            System.out.println("Wrong value");
            return getDouble(min, max);
        } else {
            return userInput;
        }
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
