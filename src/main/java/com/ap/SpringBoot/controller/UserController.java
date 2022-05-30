package com.ap.SpringBoot.controller;

import com.ap.SpringBoot.models.User;
import com.ap.SpringBoot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userService.newUser(user);
    }

    @GetMapping("/findAll")
    public List<User> findAllUser(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    @PutMapping("/edit")
    public User editUser(@RequestBody User user){
        return userService.newUser(user);
    }
}
