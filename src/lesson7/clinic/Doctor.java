package lesson7.clinic;

public class Doctor {
    private String type;
    private Integer code;

    protected Doctor(String type, Integer code) {
        this.type = type;
        this.code = code;
    }

    public void heal() {
        System.out.println("Heal");
    }

}
