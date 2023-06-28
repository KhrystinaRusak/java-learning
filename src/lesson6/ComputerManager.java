package lesson6;

public class ComputerManager {
    public static void main(String[] args) {
        RAM ram = new RAM();
        RAM ram1 = new RAM("Crucial", 1024);
        System.out.println(ram1.toString());

        HDD hdd = new HDD("Kingston", 1024, true);
        System.out.println(hdd.toString());

        Computer computer1 = new Computer(ram1, hdd, 1234, "Asus");
        System.out.println(computer1.toString());

        Computer computer = new Computer(1234, "Asus");
        System.out.println(computer);
    }


}
