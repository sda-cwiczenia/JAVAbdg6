package zad1;

public class AutoFactory {

    //Zewnętrzna metoda fabrykująca
    public static Auto createAuto(Engin engin, String model){
        Auto auto = new Audi();
        ((Audi) auto).setEngin(engin);
        ((Audi) auto).setModel(model);
        return auto;

    }
}
