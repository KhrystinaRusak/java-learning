package four.hometask4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int[] mass = new int[size];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 30);
        }
        System.out.println(Arrays.toString(mass));

        int max = mass[0];
        for (int j : mass) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Максимальный элемент в массиве " + max);

        int min = mass[0];
        for (int k : mass) {
            if (k < min) {
                min = k;
            }
        }
        System.out.println("Минимальный элемент в массиве " + min);

        double sum = 0;
        for (double value : mass) {
            sum += value;
        }
        System.out.println("Среднее арифметическое " + sum / mass.length);
    }
}
