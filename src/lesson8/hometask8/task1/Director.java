package lesson8.hometask8.task1;

public class Director implements Printable {
    private String phrase = "Директор";

    @Override
    public void print() {
        System.out.println(phrase);
    }

    public String getPhrase() {
        return phrase;
    }
}
