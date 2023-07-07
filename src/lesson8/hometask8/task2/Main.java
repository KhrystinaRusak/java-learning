package lesson8.hometask8.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите от 1 до 4, где 1 - Треугольник, 2 - Прямоугольник, 3 - Квадрат, 4 - Круг");
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> Triangle.calculate();
                case 2 -> Rectangle.calculate();
                case 3 -> Square.calculate();
                case 4 -> Circle.calculate();
            }
            System.out.println("Вы хотите продолжить? Y/N");
            if (scanner.next().toLowerCase().equals("n")) {
                break;
            }
        }

    }
}
