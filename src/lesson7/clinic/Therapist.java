package lesson7.clinic;

public class Therapist extends Doctor {
    protected Therapist() {
        super("Therapist", null);
    }

    public void heal() {
        System.out.println("Heal as therapist");
    }
}
