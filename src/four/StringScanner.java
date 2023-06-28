package four;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string");
        String str = scanner.nextLine();
        char[] characters = str.toCharArray();
        char firstElement = characters[0];
        char lastElement = characters[characters.length - 1];
        System.out.println("String starts with " + firstElement + " and ends with " + lastElement);

    }
}
