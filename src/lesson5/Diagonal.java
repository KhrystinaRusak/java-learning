package lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[][] mass = new int[size][size];
        Random random = new Random();
        for(int i = 0; i<mass.length; i++){
            for(int j = 0; j<mass[i].length;j++){
                mass[i][j] = random.nextInt(10);
            }
        }

        System.out.println(Arrays.deepToString(mass));
        for(int i = 0; i<mass.length; i++){
            for(int j = 0; j<mass[i].length;j++){
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Первая диагональ ");
        for(int i = 0; i<mass.length; i++){
            for(int j = 0; j<mass[i].length;j++){
                if(i==j){
                    System.out.print(mass[i][j]+" ");
                }
            }
        }

        System.out.println("Вторая диагональ ");
        for(int i = 0; i<mass.length; i++){
            for(int j = 0; j<mass[i].length;j++){
                if(i == mass.length - j -1){
                    System.out.print(mass[i][j]+" ");
                }
            }
        }
    }
}
