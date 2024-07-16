package com.david.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.curso.springboot.webapp.springboot_web.models.User;
import com.david.curso.springboot.webapp.springboot_web.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details")
    // Enviar datos a la vista con DTO
    public UserDto details() {

        User user = new User("David", "Erazo");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola mundo spring Boot");

        return userDto; // Compartir nuestro DTO con el frontend
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("David", "Erazo");
        User user2 = new User("Sebastian", "Chicaiza");
        User user3 = new User("Juan", "Erazo");

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        // Clase helper para que esté más limpio el código
        List<User> users = Arrays.asList(user, user2, user3);

        return users;
    }

    @GetMapping("/details-map")
    // Enviar datos a la vista con model
    public Map detailsMap() {
        User user = new User("David", "Erazo");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);
        return body;
    }

}
