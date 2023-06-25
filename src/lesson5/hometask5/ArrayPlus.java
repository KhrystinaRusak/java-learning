package lesson5.hometask5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        number++;
        String numberString = Integer.toString(number);
        char[] charArray = numberString.toCharArray();

        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }
        System.out.println(Arrays.toString(intArray));
    }
}
