package four;

import java.util.Arrays;
import java.util.Random;

public class RandomIntroduction {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Math.random());
        }

        Random random = new Random();
        System.out.println(random.nextInt(6));
        System.out.println(random.nextBoolean());

        int[] array = new int[7];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            sum += array[i];
            System.out.println(i + "-й элемент равен " + array[i]);
        }
        System.out.println("Сумма элементов массива равна " + sum);

        String[] seasons = new String[]{"autumn", "winter", "spring", "summer"};
        for (int i = 0; i < seasons.length; i++) {
            System.out.print(seasons[i]);
            if (i != seasons.length - 1) {
                System.out.print("\\");
            }
        }

        System.out.println();
        int[] mass = new int[6];
        System.out.println(Arrays.toString(mass));
        mass[2] = 2;
        mass[3] = 2;
        System.out.println(Arrays.toString(mass));

        for (int massElement : mass) {
            System.out.print(massElement + " ");
        }


    }
}
