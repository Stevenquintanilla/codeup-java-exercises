package vehicles;

public class Vehicle {
    protected int maxSpeed;
    protected String type;


    public Vehicle(String type, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public void turnOn() {
        System.out.println("ON!");
    }


}
