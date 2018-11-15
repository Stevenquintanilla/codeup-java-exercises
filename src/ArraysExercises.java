import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person){
        Person[] people1 = Arrays.copyOf(people, people.length + 1);
        people1[people1.length - 1] = person;

        return people1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setName("Jerry");
        p2.setName("Garry");
        p3.setName("Barry");
        Person[] people = new Person[3];
        people[0] = p1;
        people[1] = p2;
        people[2] = p3;

        for(Person element : people) {
            System.out.println(element.getName());
        }

//        System.out.println(Arrays.toString(numbers));
    }
}
