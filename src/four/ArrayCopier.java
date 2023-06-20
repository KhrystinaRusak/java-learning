package four;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayCopier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mass = new int[10];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 50);
        }
        System.out.println(Arrays.toString(mass));

        int[] copyMass = new int[10];
        System.arraycopy(mass, 1, copyMass, 0, 3);
        System.out.println(Arrays.toString(copyMass));

        System.out.println("Введите начальный индекс подмассива");
        int index1 = sc.nextInt();
        System.out.println("Введите последний индекс подмассива");
        int index2 = sc.nextInt();
        int subArrayLength = index2 - index1 + 1;
        int[] subArray = new int[subArrayLength];
        System.arraycopy(mass, index1, subArray, 0, subArrayLength);
        System.out.println(Arrays.toString(subArray));
    }
}
