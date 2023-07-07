package lesson8.animal;

public class Cat implements Voice, AnimalType {
    private String phrase = "mya-mya";
    private String type = "cat";

    @Override
    public void doVoice() {
        System.out.println(type + " does " + phrase);
    }

    @Override
    public String getType() {
        return type;
    }
}
