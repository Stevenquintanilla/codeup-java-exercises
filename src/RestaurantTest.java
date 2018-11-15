public class RestaurantTest {

    public static void main(String args[]) {
        RestaurantDish dish = new RestaurantDish(99, "Soup", false);


        System.out.println(dish.getCostsInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.isWouldReccomend());
        dish.setCostsInCents(250);
        dish.setNameOfDish("burger");
        dish.setWouldReccomend(true);
        System.out.println(dish.getCostsInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.isWouldReccomend());

    }
}
