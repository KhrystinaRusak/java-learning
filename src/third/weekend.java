package third;

import java.util.Scanner;

public class weekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день недели");
        String day = sc.next();
        switch (day) {
            case "понедельник", "вторник", "среда", "четверг", "пятница" -> System.out.println("Рабочий день");
            case "суббота", "воскресенье" -> System.out.println("Выходной день");
            default -> System.out.println("Неправильно ввели день недели");
        }
    }
}
