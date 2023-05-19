package creational.singleton;

public class SingletonCounter {
    private int counter;

    private SingletonCounter() {
    }

    private static class InstanceHolder {
        private static final SingletonCounter instance = new SingletonCounter();
    }

    public static SingletonCounter getInstance() {
        return InstanceHolder.instance;
    }

    public int getCounter() {
        return counter;
    }

    public int increment() {
        counter += 1;
        return counter;
    }
}
