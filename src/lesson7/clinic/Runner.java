package lesson7.clinic;

public class Runner {
    static Doctor therapist = new Therapist();
    static Doctor surgeon = new Surgeon();

    public static void main(String[] args) {


        Patient patient = new Patient();
        MedicinePlan medicinePlan = new MedicinePlan();
        patient.setMedicinePlan(medicinePlan);
    }

    public static void assignDoctor(int code) {
        switch (code) {
            case 1 -> surgeon.heal();
            case 2 -> therapist.heal();
        }
    }
}
