package four;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayCutter {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 5);
        }
        System.out.println(Arrays.toString(mass));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число удаления");
        int number = scanner.nextInt();

        int numberCounter = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == number) {
                numberCounter++;
            }
        }

        int[] mass1 = new int[mass.length - numberCounter];
        for (int i = 0, j = 0; i <= mass.length - 1; i++) {
            if (mass[i] != number)
                mass1[j++] = mass[i];
        }
        System.out.println(Arrays.toString(mass1));
    }
}
