package zad3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        context.registerShutdownHook();
        Machine machine = context.getBean("getMachine",Machine.class);
        System.out.println(machine);
    }
}
