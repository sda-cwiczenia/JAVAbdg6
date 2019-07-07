package zad3;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Machine implements InitializingBean, DisposableBean {
    Engine engine1;
    Engine engine2;
    EngineType engineType;


    public Machine(Engine engine1, Engine engine2, EngineType engineType) {

        this.engine1 = engine1;
        this.engine2 = engine2;
        this.engineType = engineType;
    }

//    public Machine() {
//        engine1 = new Engine("Silnik 1");
//        engine2 = new Engine("Silnik 2");
//        engineType = new EngineType("Silniki krokowe");
//    }

    void init() {
        System.out.println("Odpalam maszynę!");
    }

    void byebye() {
        System.out.println("Fajrant - koniec pracy!");
    }

    public Engine getEngine1() {
        return engine1;
    }

    public void setEngine1(Engine engine1) {
        this.engine1 = engine1;
    }

    public Engine getEngine2() {
        return engine2;
    }

    public void setEngine2(Engine engine2) {
        this.engine2 = engine2;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "engine1=" + engine1 +
                ", engine2=" + engine2 +
                ", engineType=" + engineType +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Odpalanie AfterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("Odpalanie metody z DisposableBean");

    }

    @PostConstruct
    void atBegin() {
        System.out.println("Nasza metoda PostConstruct");

    }

    @PreDestroy
    void atEnd() {
        System.out.println("Nasza metoda PreDestroy");

    }
}
