package zad4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("pokazAuto")
public class ShowAutoType {
    //@Qualifier("mojeAuto")
    //@Resource(name = "Audi")
    Auto auto;

    public ShowAutoType(@Qualifier("myBmw") Auto auto) {
        this.auto = auto;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "PokazAuto{" +
                "auto=" + auto +
                '}';
    }

    void pokazTypAuta() {
        this.auto.showDetails();
    }
}
