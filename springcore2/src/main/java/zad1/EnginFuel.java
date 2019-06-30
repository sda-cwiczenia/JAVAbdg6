package zad1;

public class EnginFuel implements Engin {

    private String power;

    public EnginFuel() {
    }

    public String showParameters() {
        return power;
    }

    public String showType() {
        return "FUEL";
    }

    public EnginFuel(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

}
