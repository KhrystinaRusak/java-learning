package third;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите любое число от 1 до 12");

            switch (sc.nextByte()) {
                case 1, 2, 12 -> System.out.println("Зима");
                case 3, 4, 5 -> System.out.println("Весна");
                case 6, 7, 8 -> System.out.println("Лето");
                case 9, 10, 11 -> System.out.println("Осень");
            }
            System.out.println("Вы хотите продолжить? Y/N");
            if (sc.next().toLowerCase().equals("n")) {
                return;
            }
        }
    }
}
