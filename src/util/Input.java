package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println();
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = scanner.nextLine();
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
        int userInput;

        try {
            userInput = Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please try again");
            return getInt();
        }

        return userInput;
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
        double userInput;

        try {
            userInput = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please try again");
            return getDouble();
        }

        return userInput;
    }
}
