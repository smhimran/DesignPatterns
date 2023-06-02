package creational.factorymethod.burgers;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a veggie burger...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking the veggie burger...");
    }

    @Override
    public void serve() {
        System.out.println("The veggie burger is being served...");
    }
}
