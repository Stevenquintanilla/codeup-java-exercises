public class RestaurantDish {
    private int costsInCents;
    private String nameOfDish;
    private boolean wouldReccomend;

    private void eat() {
        System.out.println("Nom nom nom!");
    }

    public RestaurantDish (int costsInCents, String nameOfDish, boolean wouldReccomend) {
        this.costsInCents = costsInCents;
        this.nameOfDish = nameOfDish;
        this.wouldReccomend = wouldReccomend;
    }

    public int getCostsInCents() {
        return costsInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public boolean isWouldReccomend() {
        return wouldReccomend;
    }

    public void setCostsInCents(int costsInCents) {
        this.costsInCents = costsInCents;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setWouldReccomend(boolean wouldReccomend) {
        this.wouldReccomend = wouldReccomend;
    }

    public static void main(String args[]) {

    }
}
