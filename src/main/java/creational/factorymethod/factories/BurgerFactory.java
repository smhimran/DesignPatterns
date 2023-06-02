package creational.factorymethod.factories;

import creational.factorymethod.burgers.BeefBurger;
import creational.factorymethod.burgers.Burger;
import creational.factorymethod.burgers.ChickenBurger;
import creational.factorymethod.burgers.VeggieBurger;

public class BurgerFactory {
    public Burger createBurger(String type) {
        return switch (type) {
            case "beef" -> new BeefBurger();
            case "chicken" -> new ChickenBurger();
            case "veggie" -> new VeggieBurger();
            default -> throw new IllegalArgumentException("Invalid burger type: " + type);
        };
    }
}
