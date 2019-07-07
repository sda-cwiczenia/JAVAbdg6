package zad3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import zad1.Engin;

@Configuration
@ComponentScan(basePackages="zad3")
//@ImportResource("konfiguracja3.xml")
public class MyConfiguration {
//    @Bean(name = "engine1")
//    //@Qualifier("engine1")
//    Engine getEngine1() {
//        Engine engine1 = new Engine("New Engine 1");
//        return engine1;
//    }
//
//    @Bean(name = "engine2")
//    //@Qualifier("engine2")
//    Engine getEngine2() {
//        return new Engine("New Engine 2");
//    }
//
//    @Bean
//    EngineType getEnginType() {
//        return new EngineType("Silnik krokowy");
//    }
//
//    @Bean(initMethod = "init", destroyMethod = "byebye")
//    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
//
//
//    Machine getMachine(Engine engine1, Engine engine2, EngineType engineType) {
//        return new Machine(engine1, engine2, engineType);
//    }
}
