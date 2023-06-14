package second;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму товара");
        float price = sc.nextFloat();
        String answer = (price >= 1400) ? "Итоговая цена " + price * 0.93 : "Итоговая цена " + price;
        System.out.println(answer);
    }
}
