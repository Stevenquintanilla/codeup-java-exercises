package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();
        Circle circle = new Circle(input.getDouble());
        boolean confirm;

        do {
            System.out.print("Enter a radius: ");
            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());
            circle.addNumOfCircles();
            System.out.println("num of circles: " + circle.getNumOfCircles());
            System.out.println("Would you like to continue?");
            confirm = input.yesNo();
        } while(confirm == true);





    }
}
