package lesson7.hometask7;

public class StudentRunner {
    /*
     * Наследование класса аспиранта от класса студент
     * */
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", 608075, 6.7);
        Student student2 = new Student("Ира", "Логан", 608075, 4.8);
        Aspirant aspirant1 = new Aspirant("Петр", "Васнецов", 43567, 8.2, "Научная работа");
        Aspirant aspirant2 = new Aspirant("Людмила", "Боснова", 43567, 4.5, "Научная работа");

        Student[] studentObj = new Student[4];
        studentObj[0] = student1;
        studentObj[1] = student2;
        studentObj[2] = aspirant1;
        studentObj[3] = aspirant2;

        System.out.println(studentObj[0].getMoney() + studentObj[1].getMoney() + studentObj[2].getMoney() + studentObj[3].getMoney());
    }
}
