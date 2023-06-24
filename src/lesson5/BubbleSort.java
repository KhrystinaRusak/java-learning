package lesson5;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] mass = new int[8];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 50);
        }
        System.out.println(Arrays.toString(mass));

        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int i = 0; i < mass.length - 1; i++) {
                if (mass[i] > mass[i + 1]) {
                    int tempValue = mass[i + 1];
                    mass[i + 1] = mass[i];
                    mass[i] = tempValue;
                    sorted = false;
                } else {
                    System.out.println("No changes");
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
