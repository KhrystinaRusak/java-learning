package first.hometask1;

import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя водителя:");
        String name = scanner.nextLine();
        System.out.println("Имя водителя: " + name);

        System.out.println("Введите имеются ли права?");
        String driverLicence  = scanner.nextLine();
        System.out.println("Права: " + driverLicence);

        System.out.println("Введите категорию прав:");
        char category = scanner.nextLine().charAt(0);
        System.out.println("Категория прав:" + category);

        System.out.println("Введите номер машины");
        int number = scanner.nextInt();
        System.out.println("Номер машины " + number);

        System.out.println("Введите марку машины");
        String kind = scanner.nextLine();
        System.out.println("Марка машины: " + kind);

        System.out.println("Введите цену за оказание водительских услуг");
        float cost = scanner.nextFloat();
        System.out.println("Цена услуги: " + cost);
    }
}
