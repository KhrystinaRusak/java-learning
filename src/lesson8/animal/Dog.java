package lesson8.animal;

public class Dog implements Voice, AnimalType {

    private String phrase = "gav-gav";
    private String type = "dog";

    @Override
    public void doVoice() {
        System.out.println(type + " does " + phrase);
    }

    @Override
    public String getType() {
        return type;
    }
}
