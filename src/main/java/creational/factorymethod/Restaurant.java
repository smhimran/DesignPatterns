package creational.factorymethod;

import creational.factorymethod.burgers.Burger;
import creational.factorymethod.factories.BurgerFactory;

public class Restaurant {
    private final BurgerFactory burgerFactory;

    public Restaurant(BurgerFactory burgerFactory) {
        this.burgerFactory = burgerFactory;
    }

    public Burger orderBurger(String type) {
        Burger burger = burgerFactory.createBurger(type);
        burger.prepare();
        burger.cook();
        return burger;
    }
}
