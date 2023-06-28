package lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
//        int[][][] array = new int[][][]{
//                {{1,2,3},{1,2,3},{1,2,3}},
//                {{1,2,3},{1,2,3},{1,2,3}},
//                {{1,2,3},{1,2,3},{1,2,3}}
//        };

        Random random = new Random();
        int[][][] array = new int[5][5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt();
                }
            }
        }

        System.out.println(Arrays.deepToString(array));

        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int change = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += change;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

    }
}
