package zad4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        ShowAutoType pokaz = context.getBean("pokazAuto", ShowAutoType.class);

        pokaz.pokazTypAuta();
    }
}
