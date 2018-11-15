public class Car {

    private String make;
    private boolean domestic;
    private int milelage;
    private boolean working;
    private static boolean hasWheels = true;

    public int addMilelage(int currentMiles) {
        this.milelage += currentMiles;
        return this.milelage;
    }

    public boolean repair() {
        if (working == false) {
           return working = true;
        } else {
            return true;
        }
    }

//    public static boolean isD

}
