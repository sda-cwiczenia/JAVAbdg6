package zad1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

//        Engin engin = new EnginDiesel("115");
//        Auto auto = new Audi(engin);

        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        Audi auto = context.getBean(Audi.class);


        System.out.println("Prezentacja auta\n-----------");
        auto.showEngin();
        System.out.println(auto.addParam);
        System.out.println(auto.getModel());
        auto.start();
        auto.accelerate(120);
        auto.slowDown(60);
        auto.stop();

    }
}
