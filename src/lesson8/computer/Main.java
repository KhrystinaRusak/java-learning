package lesson8.computer;

public class Main {
    public static void main(String[] args) {
        Hp hp = new Hp();
        Mac mac = new Mac();
        Computer[] array = {hp, mac};

        System.out.println(hp.getClassName());
        System.out.println(mac.getClassName());
    }
}
