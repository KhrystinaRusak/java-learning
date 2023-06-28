package four;

import java.util.Arrays;
import java.util.Random;

public class ArraySorter {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(0, 50);
        }

        System.out.println(Arrays.toString(mass));
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }

    }
}
