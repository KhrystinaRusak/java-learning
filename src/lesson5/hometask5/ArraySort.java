package lesson5.hometask5;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        // сортировка вставками
        int[] mass = new int[5];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 50);
        }
        System.out.println(Arrays.toString(mass));

        for (int i = 1; i < mass.length; i++) {
            int elem = mass[i];
            int j = i - 1;
            while (j >= 0 && elem < mass[j]) {
                mass[j + 1] = mass[j];
                j--;
            }
            mass[j + 1] = elem;
        }
        System.out.println(Arrays.toString(mass));
    }
}
