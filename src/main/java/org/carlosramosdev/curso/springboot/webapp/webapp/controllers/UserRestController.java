package org.carlosramosdev.curso.springboot.webapp.webapp.controllers;

import org.carlosramosdev.curso.springboot.webapp.webapp.models.User;
import org.carlosramosdev.curso.springboot.webapp.webapp.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Carlos", "Ramos", "Developer");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user1 = new User("Carlos", "Ramos", "Developer");
        User user2 = new User("Iván", "Ramos", "Estudiante");
        User user3 = new User("Vicenta", "Iserte", "Hostelería");

        return Arrays.asList(user1,user2,user3);
    }

    @GetMapping("/details.map")
    public Map<String, Object> detailsMap(){
        User user = new User("Carlos", "Ramos", "Developer");
        Map<String, Object> json = new HashMap<>();
        json.put("title", "Hola Mundo Spring Boot");
        json.put("user", user);

        return json;
    }
}
