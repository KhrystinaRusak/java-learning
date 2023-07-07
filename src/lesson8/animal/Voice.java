package lesson8.animal;

public interface Voice {
    String introduction = "All animals speak different";

    void doVoice();

    default void writeIntroduction() {
        System.out.println(introduction);
    }
}
