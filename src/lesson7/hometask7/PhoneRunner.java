package lesson7.hometask7;

/*
 * применение полиморфизма при создании методов receiveCall
 * */
public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone1 = new Phone(6775843, "Asus", 120.4);
        Phone phone2 = new Phone(5672342, "Honor", 110.3);
        Phone phone3 = new Phone(8972312, "Apple", 100.6);
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        System.out.println(phone1.receiveCall("Алина"));
        System.out.println(phone2.receiveCall("Марк"));
        System.out.println(phone3.receiveCall("Стас"));

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        System.out.println(phone1.receiveCall("Аня", 3452676));
        phone1.sendMessage(2345, 5436, 6586588, 234543);
    }
}
