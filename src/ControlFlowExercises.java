import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        long x = 2;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println();


//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x < 1000000);



//        for (int n = 0; n < 100; n++) {
//            if (n % 5 == 0 && n % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (n % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (n % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(n);
//            }
//        }
//
//        System.out.print("What number would you like to go up to: ");
//        int num = scanner.nextInt();
//        long e = 1;
//        long f = 0;
//        long g = 0;
//        System.out.println("Here is your table");
//        System.out.println("number |squared |cubed");
//        System.out.println("------\t------\t------");
//
//        for(int i = 0; i < num; i++) {
//            f = e * e;
//            g = e * e * e;
//            System.out.println(e + "\t\t" + f + "\t\t" + g);
//            e++;
//
//        }

        String input;

        do {
            System.out.print("Enter a number between 0 to 100: ");
            int h = scanner.nextInt();
            if (h <= 100 && h >= 88) {
                System.out.println("A: " + h);
            } else if (h <= 87 && h >= 80) {
                System.out.println("B: " + h);
            } else if (h <= 79 && h >= 67) {
                System.out.println("C: " + h);
            } else if (h <= 66 && h >= 60) {
                System.out.println("D: " + h);
            } else if (h <= 59 && h >= 0) {
                System.out.println("F: " + h);
            } else {
                System.out.println("Enter the correct number");
            }
            System.out.print("Would you like to continue? y/n ");
            input = scanner.next();
        } while (input.equals("y"));
    }

}
