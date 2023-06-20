package four;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFiller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Введите значения");
        int number = scanner.nextInt();
        Arrays.fill(array, number);
        System.out.println(Arrays.toString(array));


    }

}
