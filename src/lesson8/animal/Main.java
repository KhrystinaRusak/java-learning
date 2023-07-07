package lesson8.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(Voice.introduction);
        cat.writeIntroduction();

        dog.doVoice();
        cat.doVoice();
    }
}
