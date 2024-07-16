package com.david.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.david.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {
    @GetMapping("/details")
    // Enviar datos a la vista con model
    public String details(Model model) {
        User user = new User("David", "Erazo");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }
    // Enviar datos a la vista con Map
    /*
     * public String details(Map<String , Object> model) {
     * model.put("title", "Hola Mundo Spring Boot");
     * model.put("name", "David");
     * model.put("lastname", "Erazo");
     * return "details";
     * }
     */
}
