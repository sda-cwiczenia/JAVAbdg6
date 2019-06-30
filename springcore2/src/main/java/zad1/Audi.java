package zad1;

public class Audi implements Auto {

    Engin engin;
    String model;
    AddParam addParam;

    public Audi(Engin engin, String model) {
        this.engin = engin;
        this.model = model;
    }


    public Audi() {
    }

    //Metoda fabrykująca
//    public static Auto createAuto(Engin engin, String model){
//         Auto auto = new Audi();
//         ((Audi) auto).setEngin(engin);
//         ((Audi) auto).setModel(model);
//         return auto;
//
//    }


    public void setAddParam(AddParam addParam) {
        this.addParam = addParam;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engin getEngin() {
        return engin;
    }

    public void setEngin(Engin engin) {
        this.engin = engin;
    }

    public void start() {
        System.out.println("Audi rusza");
    }

    public void stop() {
        System.out.println("Audi zatrzyuje się");
    }

    public void accelerate(int speed) {
        System.out.println("Audi przyspiesza do "+speed+" km/h");
    }

    public void slowDown(int speed) {
        System.out.println("Audi zwalnia do "+speed+" km/h");
    }

    public void showEngin() {
        System.out.println("Audi ma silnik typu "+engin.showType()+" o mocy "+engin.showParameters());

    }

    public String getModel() {
        return model;
    }
}
