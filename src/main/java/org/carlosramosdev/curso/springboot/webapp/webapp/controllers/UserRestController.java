package org.carlosramosdev.curso.springboot.webapp.webapp.controllers;

import org.carlosramosdev.curso.springboot.webapp.webapp.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details(){
        User user = new User("Carlos", "Ramos", "Developer");
        Map<String, Object> json = new HashMap<>();
        json.put("title", "Hola Mundo Spring Boot");
        json.put("user", user);

        return json;
    }
}
