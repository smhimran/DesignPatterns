package creational.abstractfactory.factories;

import creational.abstractfactory.products.GPU;
import creational.abstractfactory.products.Monitor;
import creational.abstractfactory.products.MsiGPU;
import creational.abstractfactory.products.MsiMonitor;

public class MsiManufacturer implements Manufacturer {
    @Override
    public GPU createGPU() {
        return new MsiGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
