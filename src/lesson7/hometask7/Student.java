package lesson7.hometask7;

public class Student {
    String firstName;
    String lastName;
    int group;
    double averageMark;

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getMoney() {
        int sum = 0;
        if (averageMark >= 5) {
            sum = 50;
        } else {
            sum = 10;
        }
        return sum;
    }


}
