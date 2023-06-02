package creational.abstractfactory.products;

public class MsiGPU implements GPU {
    @Override
    public void assemble() {
        System.out.println("Assembling Msi GPU...");
    }
}
