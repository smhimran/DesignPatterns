package creational.factorymethod.burgers;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a beef burger...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking the beef burger...");
    }

    @Override
    public void serve() {
        System.out.println("The beef burger is being served...");
    }
}
