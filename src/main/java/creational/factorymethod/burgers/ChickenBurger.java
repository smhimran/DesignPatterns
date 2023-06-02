package creational.factorymethod.burgers;

public class ChickenBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a chicken burger...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking the chicken burger...");
    }

    @Override
    public void serve() {
        System.out.println("The chicken burger is being served...");
    }
}
