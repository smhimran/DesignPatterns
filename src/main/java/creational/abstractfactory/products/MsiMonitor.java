package creational.abstractfactory.products;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling Msi Monitor...");
    }
}
