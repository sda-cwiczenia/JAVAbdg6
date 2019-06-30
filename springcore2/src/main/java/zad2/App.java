package zad2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja2.xml");
        ListSetTable lists = context.getBean("myListSetTable", ListSetTable.class);

        System.out.println(lists);

    }
}
