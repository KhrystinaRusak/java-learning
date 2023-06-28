package third.hometask3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите положительное число");
            int number = sc.nextInt();
            int result = number * (number + 1) / 2;
            System.out.println("Сумма всех положительных чисел до " + number + " равна " + result);
            System.out.println("Вы хотите продолжить? Y/N");
            if (sc.next().toLowerCase().equals("n")) {
                return;
            }
        }
    }
}
