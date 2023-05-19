package creational.singleton;

public class Driver {
    public static void main(String[] args) {
        SingletonCounter counter1 = SingletonCounter.getInstance();
        SingletonCounter counter2 = SingletonCounter.getInstance();

        counter1.increment();
        counter2.increment();

        System.out.println("Counter: " + counter2.getCounter()); // prints 2
        System.out.println("Counter: " + counter1.increment()); // prints 3
    }
}
