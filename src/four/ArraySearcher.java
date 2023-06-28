package four;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ArraySearcher {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 50);
        }
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int pos = Arrays.binarySearch(mass, sc.nextInt());
        if (pos < 0) {
            System.out.println("Элемента нет " + pos);
        } else {
            System.out.println("Элемент на позиции " + pos);
        }
    }
}
