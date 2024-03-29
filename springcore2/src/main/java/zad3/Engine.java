package zad3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
//@Primary
//@Qualifier("engine1")
public class Engine {
    @Value("Silnik 1")
    private String name;

    public Engine() {
    }

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//@Value("Class Engin 1")

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }

}
