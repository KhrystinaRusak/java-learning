package third.hometask3;

import java.util.Scanner;

public class Cloth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер одежды ");
        String size = sc.next();
        switch (size) {
            case "XS" -> System.out.println("очень маленький");
            case "S" -> System.out.println("маленький");
            case "M" -> System.out.println("средний");
            case "L" -> System.out.println("большой");
            case "XL" -> System.out.println("очень большой");
            case "XXL", "XXXL", "XXXXL", "XXXXXL" -> System.out.println("очень-очень большой");
            default -> System.out.println("Неверный ввод");
        }
    }
}
