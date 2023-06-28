package third.hometask3;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert temperature ");
        double t = sc.nextDouble();
        if (t > -5) {
            System.out.println("\"Warm\"");
        } else if (t <= -20) {
            System.out.println("\"Cold\"");
        } else if ((t <= -5) && (t > -20)) {
            System.out.println("\"Normal\"");
        }
    }
}
