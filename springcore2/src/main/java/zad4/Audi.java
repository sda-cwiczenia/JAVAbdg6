package zad4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import zad1.AutoFactory;

import javax.annotation.Resource;
import javax.xml.bind.annotation.XmlEnumValue;

@Component("audi")
//@Qualifier("myAudi")
@PropertySource("audi.properties")
public class Audi implements Auto {

    //@Value("3")
    String liczba_drzwi;
    //@Value("wielosezonowe")
    String rodzaj_kol;
    String typeOfAuto = "a6";
    int price = 15000;

@Autowired
    public Audi(@Value("4") String liczba_drzwi, @Value("${rodzaj_kol}") String rodzaj_kol) {
        this.liczba_drzwi = liczba_drzwi;
        this.rodzaj_kol = rodzaj_kol;
    }
//@Autowired
    public Audi(@Value("6") String liczba_drzwi) {
        this.liczba_drzwi = liczba_drzwi;
    }

//    public Audi() {
//    }

    public void showDetails() {
        System.out.println("Jestem Audi, liczba_drzwi :"+liczba_drzwi+" rodzaj kół :"+rodzaj_kol);

    }

    //@Value("${liczba_drzwi}")
    public void setLiczba_drzwi(String liczba_drzwi) {
        this.liczba_drzwi = liczba_drzwi;
    }

    //@Value("${rodzaj_kol}")
    public void setRodzaj_kol(String rodzaj_kol) {
        this.rodzaj_kol = rodzaj_kol;
    }

    public String getTypeOfAuto() {
        return typeOfAuto;
    }

    public int getPrice() {
        return price;
    }
}
