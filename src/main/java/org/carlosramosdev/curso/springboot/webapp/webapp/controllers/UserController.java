package org.carlosramosdev.curso.springboot.webapp.webapp.controllers;

import org.carlosramosdev.curso.springboot.webapp.webapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Carlos", "Ramos", "Developer");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user",user);

        return "details";
    }

}
