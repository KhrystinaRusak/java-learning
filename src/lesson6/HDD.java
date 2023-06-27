package lesson6;

public class HDD {
    String name;
    int capacity;
    boolean internal;

    public HDD() {
    }

    public HDD(String name, int capacity, boolean internal) {
        this.name = name;
        this.capacity = capacity;
        this.internal = internal;
    }

    public String toString() {
        return "name: " + name + " capacity: " + capacity + " internal: " + internal;
    }
}
