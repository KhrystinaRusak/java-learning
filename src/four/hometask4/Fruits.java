package four.hometask4;

import java.util.Arrays;

public class Fruits {
    public static void main(String[] args) {
        String[] fruits = {"Банан", "Апельсин", "Киви", "Мандарин"};
        System.out.println("Второй фрукт " + fruits[1]);
        System.out.println("Четвертый фрукт " + fruits[3]);
        fruits[2] = "Лимон";
        System.out.println(Arrays.toString(fruits));
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
    }
}
