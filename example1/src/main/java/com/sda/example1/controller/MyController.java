package com.sda.example1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/sda")
@RestController
//@Controller
//@ResponseBody
public class MyController {

//    @RequestMapping(value = "/welcome", method = {RequestMethod.GET,RequestMethod.POST})
//    public String welcome() {
//        return "Cześć witaj w spring boot!";
//    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(defaultValue = "Admin") String name, @RequestParam(defaultValue = "Sobota") String dzien,
    @RequestParam(required = false) String inny) {
        inny = "Inny";
        return "Cześć "+name+" witaj w spring boot! Dziś jest "+dzien;
    }

    @GetMapping("/welcome/{id}/powitanie")
    public String welcome2(@PathVariable String id) {
        return "Witaj użytkowniku o id: "+id;
    }


}
