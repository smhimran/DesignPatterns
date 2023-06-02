package creational.abstractfactory.factories;

import creational.abstractfactory.products.GPU;
import creational.abstractfactory.products.Monitor;

public interface Manufacturer {
    GPU createGPU();
    Monitor createMonitor();
}
