package com.sda.example1.service;

import com.sda.example1.model.Auto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoService {

    public List<Auto> auta;

    public AutoService() {
        List<Auto> lista = new ArrayList<>();
        lista.add(new Auto("Audi", "1700"));
        lista.add(new Auto("Polonez", "1600"));
        lista.add(new Auto("Lada", "1300"));
        lista.add(new Auto("Bmw", "2000"));
        auta = lista;
    }

    public Auto getAutoByName(String name) {
        return auta.stream()
                .filter(a -> (a.getName().equals(name))).findFirst().orElseGet(()->null);
    }

    public List<Auto> getAll() {
        return auta;
    }

    public void addAuto(String name, String moc) {
        auta.add(new Auto(name, moc));
    }
}
