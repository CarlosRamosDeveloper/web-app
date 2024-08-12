package org.carlosramosdev.curso.springboot.webapp.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserRestController {

    @GetMapping("/api/details")
    public Map<String, Object> details(){
        Map<String, Object> json = new HashMap<>();
        json.put("title", "Hola Mundo Spring Boot");
        json.put("name","Carlos");
        json.put("lastname","Ramos");
        json.put("ocupation","Developer");

        return json;
    }

}
