package org.carlosramosdev.curso.springboot.webapp.webapp.controllers;

import org.carlosramosdev.curso.springboot.webapp.webapp.models.User;
import org.carlosramosdev.curso.springboot.webapp.webapp.models.dto.ParamDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {
    @Value("${config.username}")
    private String username;

    @Value("${config.message}")
    private String message;

    @Value("${config.listOfValues}")
    private List<String> listOfValues;

    @Value("#{'${config.listOfValues}'.toLowerCase().split(',')}")
    private List<String> valueList;

    @Value("#{'${config.listOfValues}'.toUpperCase()}")
    private String valueString;

    @Value("${config.code}")
    private Integer code;

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message){
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable long id){

        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);

        return json;
    }
    @PostMapping("/create")
    public User create(@RequestBody User user) {
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values(){
        Map <String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("message", message);
        json.put("code", code);
        json.put("listOfValues", listOfValues);
        json.put("valueList", valueList);
        json.put("valueString", valueString);

        return json;
    }
}
