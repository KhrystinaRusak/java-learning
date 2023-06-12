package first.hometask1;

import java.util.Scanner;
public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество денег в белорусских рублях");
        float moneyInput = sc.nextFloat();

        double dollarYesterday = (moneyInput / 2.9);
        double russianYesterday = (moneyInput * 27.8);
        System.out.println("Вчерашний курс доллара: " + dollarYesterday + "\nВчерашний курс российского рубля: " + russianYesterday);

        double dollarToday = (moneyInput / 2.94);
        double russianToday = (moneyInput * 27.6);
        System.out.println("Сегодняшний курс доллара: " + dollarToday + "\nСегодняшний курс российского рубля: " + russianToday);

        String answerDollar = dollarYesterday > dollarToday ? "Курс доллара уменьшился" : "Курс доллара увеличился";
        String answerRussian = russianYesterday > russianToday ? "Курс российского рубля уменьшился" : "Курс российского рубля увеличился";

        System.out.println(answerDollar);
        System.out.println(answerRussian);
    }
}
