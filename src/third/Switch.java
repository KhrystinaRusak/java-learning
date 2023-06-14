package third;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время");
        String dayTime = sc.next();
        /*switch (dayTime) {
            case  "утро":
                System.out.println("Утро начинается с 6 до 12");
                break;
            case "день":
                System.out.println("День начинается с 12 до 18");
                break;
            case "вечер":
                System.out.println("Вечер начинается с 18 до 23");
                break;
            case "ночь":
                System.out.println("Ночь начинается с 23 до 6");
                break;
            default:
                System.out.println("Неизвестное время");
        }*/
        switch (dayTime) {
            case  "утро"-> System.out.println("Утро начинается с 6 до 12");
            case "день" -> System.out.println("День начинается с 12 до 18");
            case "вечер" -> System.out.println("Вечер начинается с 18 до 23");
            case "ночь" -> System.out.println("Ночь начинается с 23 до 6");
            default -> System.out.println("Неизвестное время");
        }
    }
}
