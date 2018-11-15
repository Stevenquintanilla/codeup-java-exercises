import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String message = "We don't need no education\n" +
//                "We don't need no thought control\n" +
//                "Check \"this\" out!, \"s inside of \"s!\n" +
//                "In windows, the main drive is usually C:\\\n" +
//                "I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash\\\\\\!";
//
//        System.out.println(message);

        System.out.print("Enter a date in the following format: MM/DD/YYYY");
        String output;
        String userDate = scanner.nextLine();

        switch (userDate.substring(0, 2)) {
            case "01":
                output= userDate.replace("01", "January")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;
            case "02":
                output= userDate.replace("02", "February")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;
            case "03":
                output= userDate.replace("01", "March")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;
            case "04":
                output= userDate.replace("01", "April")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;
            case "05":
                output= userDate.replace("01", "May")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;
            case "06":
                output= userDate.replace("01", "June")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;
            case "07":
                output= userDate.replace("01", "July")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;
            case "08":
                output= userDate.replace("01", "August")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;
            case "09":
                output= userDate.replace("01", "September")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;
            case "10":
                output= userDate.replace("01", "October")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;
            case "11":
                output= userDate.replace("01", "November")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;
            case "12":
                output= userDate.replace("01", "December")
                        .replaceFirst("/", " ")
                        .replace("/", ", ");
                System.out.println(output);
                break;


        }
    }
}
