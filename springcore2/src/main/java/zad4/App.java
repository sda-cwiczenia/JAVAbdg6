package zad4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        ShowAutoType pokazAuto1 = context.getBean("pokazAuto", ShowAutoType.class);
        pokazAuto1.pokazTypAuta();

//        ShowAutoType pokazAuto2 = context.getBean("pokazAuto", ShowAutoType.class);
//        pokazAuto2.pokazTypAuta();
    }
}
