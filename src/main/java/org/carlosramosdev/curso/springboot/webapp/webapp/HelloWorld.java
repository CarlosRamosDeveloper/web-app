package org.carlosramosdev.curso.springboot.webapp.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorld {

    @GetMapping("/app/hello")
    Map<String, String> salute (){
        Map<String, String> json = new HashMap<>();
        json.put("saludo", "hola mundo");
        return json;
    }

}
