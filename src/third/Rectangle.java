package third;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sideSize = new int[4];


        for (int i = 0; i < sideSize.length; i++) {
            System.out.println("Введите длину сторону четырехугольника");
            sideSize[i] = sc.nextInt();
            System.out.println(i + " - " + sideSize[i]);
        }

        for (int i = 0; i < sideSize.length; i++) {
            System.out.println(i + " - " + sideSize[i]);
        }

        if(sideSize [0]==sideSize[1] && sideSize [2]==sideSize [3] && sideSize [1]==sideSize [2] && sideSize [3]==sideSize [0]){
            System.out.println("Квадрат");
        }
        if(sideSize[0] == sideSize[2] && sideSize[1] == sideSize[3]){
            System.out.println("Параллелограмм");
        }
    }
}
