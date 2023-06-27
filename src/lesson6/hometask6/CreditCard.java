package lesson6.hometask6;

public class CreditCard {
    int accountNumber;
    double sumAccount;

    public CreditCard(int accountNumber, double sumAccount) {
        this.accountNumber = accountNumber;
        this.sumAccount = sumAccount;
    }

    public double addSum(double addSum) {
        return sumAccount = sumAccount + addSum;
    }

    public double subtractSum(double subtractSum) {
        return sumAccount = sumAccount - subtractSum;
    }

    public String toString() {
        return "Номер счета: " + accountNumber + " Сумма на счете: " + sumAccount;
    }
}
