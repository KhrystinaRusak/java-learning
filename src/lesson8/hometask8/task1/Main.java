package lesson8.hometask8.task1;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Director director = new Director();
        Accountant accountant = new Accountant();

        worker.print();
        director.print();
        accountant.print();
    }
}
