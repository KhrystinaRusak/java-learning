package lesson5;

import java.util.Arrays;
import java.util.Random;

public class HalfSquare {
    public static void main(String[] args) {
        int size = 5;
        int[] mas = new int[size];
        Random random = new Random();
        for(int i = 0; i<mas.length; i++){
                mas[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mas));

        int[][] newMas = new int[size][];
        for(int i = 0; i < size; i++){
            newMas[i] = new int[size-i];

        }
        System.out.println(Arrays.deepToString(newMas));

        newMas[0] = mas;
        //for(int i = 0; i < newMas[1].length;i++){
            for(int i = 0; i < newMas[1].length;i++)
            newMas[1][i] = newMas[0][i] + newMas[0][i+1];
        //}
    }
}
