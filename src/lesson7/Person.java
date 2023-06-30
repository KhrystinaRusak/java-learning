package lesson7;

public class Person {
    public String name;
    int age;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Age: " + age + " Gender: " + getGender();
    }
}
