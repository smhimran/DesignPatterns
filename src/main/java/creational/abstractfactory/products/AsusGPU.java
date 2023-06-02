package creational.abstractfactory.products;

public class AsusGPU implements GPU {
    @Override
    public void assemble() {
        System.out.println("Assembling Asus GPU...");
    }
}
