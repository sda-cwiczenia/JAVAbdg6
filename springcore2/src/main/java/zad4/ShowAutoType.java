package zad4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("pokazAuto")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope("singleton")
public class ShowAutoType {

//    @Autowired
//    @Qualifier("myBmw")
    Auto auto;
    String color;
    //@Value("#{audi.getTypeOfAuto()?.toUpperCase()}")
    //@Value("#{audi.getPrice() <= 10000 ? 'Dobra cena < 10000' : 'Cena wygorowana'}")
    //@Value("#{audi.getPrice() matches '[10000 - 12000]' ? 'Dobra cena 10000-12000' : 'Cena wygorowana'}")
    //@Value("#{audi.getTypeOfAuto()?.toUpperCase() eq 'A6' ? 'To jest A6' : 'To nie jest A6'}")
    //@Value("#{audi.getTypeOfAuto()?:'Załóżmy że to A6'}")
    String autoType;
    static int objectNr = 0;

@Autowired
    public ShowAutoType(@Value("#{myAudi}") Auto auto) {
        this.auto = auto;
        objectNr++;
    System.out.println("Pobrany obiekt ma nr : "+getObjectNr());
    }
//@Autowired
    public ShowAutoType(@Qualifier("bmw") Auto auto, @Value("czerwony") String color) {
        this.auto = auto;
        this.color = color;
    }



    public static int getObjectNr() {
        return objectNr;
    }

//    public ShowAutoType() {
//    }

    public Auto getAuto() {
        return auto;
    }

    @Autowired
    @Qualifier("myAudi")
    //@Resource(name = "audi")
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
        auto.showDetails();
        System.out.println("Typ auta : "+autoType);
    }
}
