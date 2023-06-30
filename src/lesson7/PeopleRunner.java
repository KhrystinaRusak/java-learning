package lesson7;

public class PeopleRunner {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Igor";
        person1.age = 102;
        person1.setGender("Male");
        System.out.println(person1.toString());
    }
}
