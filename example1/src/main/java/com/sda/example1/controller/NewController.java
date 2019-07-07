package com.sda.example1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewController {

    @GetMapping("/home")
    public String przekaz(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String welcome() {

        return "index";
    }

    @ModelAttribute
    public void addAttributes(Model model) {

        model.addAttribute("name", "Admin");
        System.out.println("Inicjacja ModelAttibute");
    }
}
