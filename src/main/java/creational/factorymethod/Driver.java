package creational.factorymethod;

import creational.factorymethod.burgers.Burger;
import creational.factorymethod.factories.BurgerFactory;

public class Driver {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(new BurgerFactory());

        Burger beefBurger = restaurant.orderBurger("beef");
        beefBurger.serve();

        Burger chickenBurger = restaurant.orderBurger("chicken");
        chickenBurger.serve();

        Burger veggieBurger = restaurant.orderBurger("veggie");
        veggieBurger.serve();
    }
}
