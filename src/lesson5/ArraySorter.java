package lesson5;

import java.util.Arrays;
import java.util.Random;

public class ArraySorter {
    public static void main(String[] args) {
        int[][] mass = new int[5][7];
        Random random = new Random();
        for(int i = 0; i<mass.length; i++){
            for(int j = 0; j<mass[i].length;j++){
                mass[i][j] = random.nextInt(10);
            }
        }

        System.out.println(Arrays.deepToString(mass));

        for(int i = 0; i < mass.length; i++){
            Arrays.sort(mass[i]);
        }
        System.out.println(Arrays.deepToString(mass));
    }
}
