package lesson8.hometask8.task1;

public class Accountant implements Printable {
    private String phrase = "Бухгалтер";

    @Override
    public void print() {
        System.out.println(phrase);
    }

    public String getPhrase() {
        return phrase;
    }
}
