package lesson6;

public class Computer {
    double cost;
    String model;

    RAM ram;
    HDD hdd;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computer(RAM ram, HDD hdd, double cost, String model) {
        this.ram = ram;
        this.hdd = hdd;
        this.cost = cost;
        this.model = model;
    }

    public String toString() {
        return "ram: " + ram + " hdd: " + hdd + " cost: " + cost + " model: " + model;
    }


}
