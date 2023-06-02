package creational.abstractfactory.factories;

import creational.abstractfactory.products.AsusGPU;
import creational.abstractfactory.products.AsusMonitor;
import creational.abstractfactory.products.GPU;
import creational.abstractfactory.products.Monitor;

public class AsusManufacturer implements Manufacturer {
    @Override
    public GPU createGPU() {
        return new AsusGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
