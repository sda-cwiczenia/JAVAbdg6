package com.sda.example1.controller;

import com.sda.example1.model.Auto;
import com.sda.example1.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AutoController {

    AutoService autoService;

    @Autowired
    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    @GetMapping(value = "/auto", produces = "application/json")
    public Auto getAuto(@RequestParam(defaultValue = "Audi") String name) {
        return autoService.getAutoByName(name);

    }

    @GetMapping(value = "/auta", produces = "application/json")
    public List<Auto> getAuta() {
        return autoService.getAll();
    }

    @PostMapping(value = "/auta",
            produces = "application/json")
    public void addAuto(@RequestParam String name, @RequestParam String moc) {
        autoService.addAuto(name, moc);
    }

    @PutMapping(value = "/auta", produces = "application/json")
    public void addAuto2(@RequestBody Auto auto) {
        autoService.auta.add(auto);
    }

    @PutMapping(value = "/auta-lista", produces = "application/json")
    public void addList(@RequestBody List<Auto> lista) {
        autoService.auta.addAll(lista);
    }


}