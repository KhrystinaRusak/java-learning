package first;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number % 2 == 0){
            System.out.println("Четный");
        } else {System.out.println("Нечетный");}
    }
}
