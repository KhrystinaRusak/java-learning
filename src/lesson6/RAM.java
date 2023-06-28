package lesson6;

public class RAM {
    String name;
    int capacity;

    public RAM() {

    }

    public RAM(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return "name: " + name + " capacity: " + capacity;
    }
}
