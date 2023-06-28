package third.hometask3;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время в часах от 0 до 24");
        byte time = sc.nextByte();
        if ((time >= 10) && (time <= 19)) {
            System.out.println("\"Добро пожаловать\"");
        } else if (time > 24) {
            System.out.println("\"Ошибка ввода\"");
        } else {
            System.out.println("\"Закрыто\"");
        }
    }
}
