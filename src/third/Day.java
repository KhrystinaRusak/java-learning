package third;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время в часах ");
        int hours = sc.nextInt();
        if (hours >= 6 && hours < 12) {
            System.out.println("Утро");
        } else if (hours >= 12 && hours < 16) {
            System.out.println("День");
        } else if (hours >= 16 && hours < 22) {
            System.out.println("Вечер");
        } else if ((hours >= 22 && hours < 24) || (hours >= 0 && hours < 6)) {
            System.out.println("Ночь");
        } else System.out.println("Неккоректные данные");
    }
}
