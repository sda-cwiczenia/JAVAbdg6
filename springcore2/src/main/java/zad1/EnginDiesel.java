package zad1;

public class EnginDiesel implements Engin {

    private String power;

    public EnginDiesel() {
    }

    public String showParameters() {
        return power;
    }

    public String showType() {
        return "DIESEL";
    }

    public EnginDiesel(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
