package org.carlosramosdev.curso.springboot.webapp.webapp.controllers;

import org.carlosramosdev.curso.springboot.webapp.webapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Carlos", "Ramos", "Developer");
        user.setEmail("Test@gmail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user",user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
                new User("Carlos", "Ramos", "Developer","Test@gmail.com"),
                new User("Iván", "Ramos", "Estudiante", "Testmail@gmail.com"),
                new User("Vicenta", "Iserte", "Hostelería","Testingmail@gmail.com")
        );
        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");

        return "list";
    }

}
