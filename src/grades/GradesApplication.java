package grades;
import util.Input;
import java.util.HashMap;



public class GradesApplication {
    private static HashMap<String, Student> students = new HashMap<>();
    private static Input input = new Input();



    public static void userMenu() {
        System.out.println("\nWelcome! Here are the github usernames of our students: ");
        students.entrySet().forEach(entry -> System.out.print("\t|" + entry.getKey() + "| "));

        System.out.println("\n\nWhat would you like to do?");
        System.out.println("0. Exit");
        System.out.println("1. Get student information");
        System.out.println("2. See all student grades");
        System.out.println("3. See class grade average");

    }

    public static void getStudentInfo() {
        System.out.println("\n\nWhat student you would like to see more information on?");
        String username = input.getString();
        if (!students.containsKey(username)) {
            System.out.println("Sorry, a student was not found by that username");
        } else {
            System.out.println("Student name: " + students.get(username).getName());
            System.out.println("Student grades: " + students.get(username).getGrades());
            System.out.println("Student's average grade: " + students.get(username).getGradeAverage());
        }
    }

    public static void getAllGrades() {
        for (Student value : students.values()) {
            System.out.println("Grades : " + value.getGrades());
        }
    }

    public static void getClassAverage() {
        double total = 0;
        for (Student value: students.values()) {
            total += value.getGradeAverage();
        }
        total /= students.size();
        System.out.println(total);
    }

    public static void main(String[] args) {

        Student barry = new Student("Barry");
        Student mary = new Student("Mary");
        Student gary = new Student("Gary");
        Student larry = new Student("Larry");
        int userInput;
        String confirm;

        barry.addGrade(99);
        barry.addGrade(99);
        barry.addGrade(99);
        mary.addGrade(98);
        mary.addGrade(98);
        mary.addGrade(98);
        gary.addGrade(97);
        gary.addGrade(97);
        gary.addGrade(97);
        larry.addGrade(96);
        larry.addGrade(96);
        larry.addGrade(96);

        students.put("madbarry", barry);
        students.put("madlarry", larry);
        students.put("madgary", gary);
        students.put("madmary", mary);



        do {
            userMenu();
            userInput = input.getInt(0, 3);

            switch (userInput) {
                case 1:
                    input.getString();
                    getStudentInfo();
                    System.out.print("Would you like to continue?");
                    break;
                case 2:
                    input.getString();
                    getAllGrades();
                    System.out.print("Would you like to continue?");
                    break;
                case 3:
                    getClassAverage();
                    System.out.println();
                    System.out.print("Would you like to continue?");
            }
            confirm = input.getString();
            if(confirm.equals("yes") || confirm.equals("y")) {
                System.out.println("Restarting the program...");
                continue;
            } else {
                System.out.println("Exiting out...");
                break;
            }
        } while (userInput != 0);



    }
}
