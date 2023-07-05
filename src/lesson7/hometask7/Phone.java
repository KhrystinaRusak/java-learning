package lesson7.hometask7;

public class Phone {
    int number;
    String model;
    double weight;

    public Phone(int number, String model, double weight) {
//        this.number = number;
//        this.model = model;
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String toString() {
        return "Номер: " + number + " модель: " + model + " вес: " + weight;
    }

    public String receiveCall(String name) {
        return "Звонит " + name;
    }

    public int getNumber() {
        return number;
    }

    public String receiveCall(String name, int number) {
        return "Имя: " + name + " телефон: " + number;
    }

    public void sendMessage(int... number) {
        for (int n : number) {
            System.out.print(n + " ");
            ;
        }
    }
}
