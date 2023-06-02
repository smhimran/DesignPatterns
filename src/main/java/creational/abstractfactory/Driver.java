package creational.abstractfactory;

import creational.abstractfactory.factories.AsusManufacturer;
import creational.abstractfactory.factories.Manufacturer;
import creational.abstractfactory.factories.MsiManufacturer;
import creational.abstractfactory.products.Product;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Manufacturer asus = new AsusManufacturer();
        Manufacturer msi = new MsiManufacturer();

        System.out.println("Building PC with Asus GPU and Msi Monitor");
        List.of(asus.createGPU(), asus.createMonitor())
                .forEach(Product::assemble);

        System.out.println("Building PC with Msi GPU and Asus Monitor");
        List.of(msi.createGPU(), asus.createMonitor())
                .forEach(Product::assemble);
    }
}
