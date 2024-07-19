package com.apiIntelligentcare.controllers;

import com.apiIntelligentcare.entitiles.Cursos;

import com.apiIntelligentcare.entitiles.User;
import com.apiIntelligentcare.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List user(){
        return userService.listAll();
    }

    @GetMapping("/users/{id}")
    public Object userId(@PathVariable Integer id){
        return userService.listId(id);
    }

    @PostMapping("/add-user")
    public Object cadastroCurso(@RequestBody User user){
        return userService.saveCurso(user);
    }

    @DeleteMapping("dell-user/{id}")
    public void deleteCurso(@PathVariable Integer id) {
        userService.dellCurso(id);
    }

    @PutMapping("/update-user/{id}")
    public Object atualiCarro(@PathVariable Integer id,@RequestBody User user) {
        return userService.atualiUser(id,user);
    }
}
