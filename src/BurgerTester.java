public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools btools = new BurgerTools();
        btools.averageDayBeforeExpiration = 2;
        btools.mostPopularTopping = "Onions, lettuce, and pickles";
        btools.temperatureWhenCooked = 160;
        System.out.println(btools.averageDayBeforeExpiration);
        System.out.println(btools.mostPopularTopping);
        System.out.println(btools.temperatureWhenCooked);
        btools.grill();
    }
}
