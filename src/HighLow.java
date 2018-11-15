import java.util.Scanner;
import java.util.Random;

public class HighLow {

    public static void main(String args[]) {

//        theGame(gameRandom(), 0);

        wholeNumber("nine");

    }

    public static int gameRandom() {
        Random rand = new Random();
        int x = rand.nextInt(100) + 1;
        return x;
    }

    public static int theGame(int random, int guess) {
        if (guess == 4) {
            System.out.println("You lose!");
            return guess;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println(random);
        System.out.print("Guess a number between 1-100 ");
        int userNum = scanner.nextInt();
        if (userNum > random) {
            System.out.println("Guess lower");
            return theGame(random, guess + 1);
        } else if (userNum < random) {
            System.out.println("Guess Higher");
            return theGame(random, guess + 1);
        } else {
            System.out.println("Congrats! You win!");
            return userNum;
        }

        }

    public static void getType(int x) {
        System.out.println(x + " is  a integer");
    }

    public static void getType(double x) {
        System.out.println(x + " is  a double");
    }

    public static void getType(String x) {
        System.out.println(x + " is  a String");
    }

    public static void getType(char x) {
        System.out.println(x + " is  a integer");
    }

    public static void getType(boolean x) {
        System.out.println(x + " is  a integer");
    }

    public static void wholeNumber(String numberName) {

        if (numberName.contains("-")) {
            String firstWord = numberName.substring(0, numberName.indexOf("-"));
            String secondWord = numberName.substring(numberName.indexOf("-") + 1);

            System.out.println(firstWord);
            System.out.println(secondWord);
        }



        System.out.println(numberName);


    }


}
