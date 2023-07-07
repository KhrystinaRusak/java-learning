package lesson8.hometask8.task1;

public class Worker implements Printable {
    private String phrase = "Рабочий";

    @Override
    public void print() {
        System.out.println(phrase);
    }

    public String getPhrase() {
        return phrase;
    }
}
