import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Addition(3, 4));
        System.out.println(Subtraction(10, 4));
//        System.out.println(Multiplication(3, 4));
        System.out.println(Division(8, 4));
        System.out.println(Remainder(5, 3));

//        System.out.println(intRange(1, 10));

//        System.out.println(factorial(intRange(1, 10)));

        rollDice();

    }

    public static int Addition(int x, int y) {
        return x + y;
    }

    public static int Subtraction(int x, int y) {
        return x - y;
    }

//    public static int Multiplication(int x, int y) {
//        int result = 0;
////        for (int i = 0; i < y; i++) {
////            result += x;
////        }
////        return result;
//        if (y <= 0) {
//            return result;
//        }
//        result += x;
//        Multiplication(x, y - 1);
//    }

    public static int Division(int x, int y) {
        return x / y;
    }

    public static int Remainder(int x, int y) {
        return x % y;
    }

    public static int intRange(int x, int y) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Enter a number between %s and %s ", x, y);
        int userInput = scanner.nextInt();
        if (userInput < x || userInput > y) {
            System.out.println("Wrong value");
            return intRange(x, y);
        }
        return userInput;
    }

    public static long factorial(long x) {
        Scanner scanner = new Scanner(System.in);
        long count = 1;
        for (int i = 1; i <= x; i++) {
            count *= i;
        }
        System.out.print("The factorial of the number "+  x + " is " +
                count +". Would you like another number? y/n ");
        String confirm = scanner.next();
        if (confirm.equalsIgnoreCase("y")) {
            return factorial(intRange(1, 10));
        }

        return count;
    }

    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides on the pair of dice: ");
        int sides = scanner.nextInt();
        int dice1 = random(sides);
        int dice2 = random(sides);
        System.out.println("You roll " + dice1 + " and " + dice2);
    }

    public static int random(int x) {
        Random rand = new Random();
        int random = rand.nextInt(x) + 1;
        return random;
    }

}
