package zad3;

public class AppClasic {
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        engine1.setName("Silnik 1");
        Engine engine2 = new Engine("Silnik 2");

        EngineType engineType = new EngineType("Silniki krokowe");

        Machine machine = new Machine(engine1, engine2, engineType);
//   Machine machine = new Machine();
        System.out.println("Maszyna ma :"
                +machine.engine1+" "
                +machine.engine2+" "+machine.engineType);
    }
}
