package zad4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import zad1.AutoFactory;

import javax.annotation.Resource;
import javax.xml.bind.annotation.XmlEnumValue;

@Component
@PropertySource("audi.properties")
public class Audi implements Auto {

    String liczba_drzwi;
    String rodzaj_kol;
    String typeOfAuto;

//    public Audi(String liczba_drzwi, String rodzaj_kol) {
//        this.liczba_drzwi = liczba_drzwi;
//        this.rodzaj_kol = rodzaj_kol;
//    }

    public void showDetails() {
        System.out.println("Jestem Audi, liczba_drzwi :"+liczba_drzwi+" rodzaj kół :"+rodzaj_kol);

    }

    @Value("${liczba_drzwi}")
    public void setLiczba_drzwi(String liczba_drzwi) {
        this.liczba_drzwi = liczba_drzwi;
    }

    @Value("${rodzaj_kol}")
    public void setRodzaj_kol(String rodzaj_kol) {
        this.rodzaj_kol = rodzaj_kol;
    }

    String typeOfAuto() {
        return "A6";
    }


    //@Value("#{typeOfAuto()?: typeOfAuto}")
    //@Autowired
    public void setTypeOfAuto(@Value("A6") String typeOfAuto) {
        this.typeOfAuto = typeOfAuto;
    }
}
