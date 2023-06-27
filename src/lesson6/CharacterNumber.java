package lesson6;

public class CharacterNumber {

    //static
    public static void main(String[] args) {
        int length = 128;
        changeLength(length);
        char[] array = new char[length];
        fillMass(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " number is: " + array[i] + " character");
        }
    }

    public static void changeLength(int length) {
        length = length / 2;
    }

    public static void fillMass(char[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) i;
        }
    }
}
