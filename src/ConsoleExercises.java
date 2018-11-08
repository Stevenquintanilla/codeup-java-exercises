import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %s\n", pi);

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.format("You entered: %s \n", userInput);

//        System.out.print("Enter three words: ");
//        String first, second, third;
//        first = scanner.nextLine();
//        second = scanner.nextLine();
//        third = scanner.nextLine();

//        System.out.format("The three words you entered are %s, %s, and %s", first
//        , second, third);

//        System.out.print("Enter a sentence: ");
//        String userSent= scanner.nextLine();
//        System.out.println(userSent);

        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();
        double area = width * height;
        double perimeter = width + height;

        System.out.println("The area is: " + area + " and the perimeter is: " +
                perimeter);
    }
}
