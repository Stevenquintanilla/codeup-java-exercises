package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < grades.size(); i++) {
            total+= grades.get(i);
        }

        return total / grades.size();
    }

    public static void main(String[] args) {
        Student steven = new Student("Steven");

        System.out.println(steven.getName());
        steven.addGrade(100);
        steven.addGrade(100);
        steven.addGrade(100);


        System.out.println(steven.getGradeAverage());
    }


}
