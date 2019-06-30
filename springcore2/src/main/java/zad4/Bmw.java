package zad4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("myBmw")
//@Primary
public class Bmw implements Auto {
    public void showDetails() {
        System.out.println("Jestem BMW");
    }
}
