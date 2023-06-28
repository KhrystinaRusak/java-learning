package lesson5;

import java.util.Arrays;
import java.util.Random;

public class SumArray {
    public static void main(String[] args) {
        int[][] mass = new int[10][6];
        Random random = new Random();
        for(int i = 0; i<mass.length; i++){
            for(int j = 0; j<mass[i].length;j++){
                mass[i][j] = random.nextInt(10);
            }
        }

        System.out.println(Arrays.deepToString(mass));

        int sum = 0;
        for(int i = 0; i<mass.length; i++){
            for(int j = 0; j<mass[i].length;j++){
                sum += mass[i][j];
            }
        }
        System.out.println(sum);
    }
}
