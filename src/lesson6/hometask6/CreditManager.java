package lesson6.hometask6;

public class CreditManager {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(1, 2000);
        CreditCard creditCard2 = new CreditCard(2, 1000);
        CreditCard creditCard3 = new CreditCard(3, 500);

        System.out.println(creditCard1.toString());
        System.out.println(creditCard2.toString());
        System.out.println(creditCard3.toString());
        System.out.println();

        creditCard1.addSum(100);
        creditCard2.addSum(50);
        creditCard3.subtractSum(45);
        System.out.println(creditCard1.toString());
        System.out.println(creditCard2.toString());
        System.out.println(creditCard3.toString());
    }
}
