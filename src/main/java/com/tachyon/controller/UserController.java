package com.tachyon.controller;

import com.tachyon.domain.entity.User;
import com.tachyon.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // == @Controller + @ResponseBody
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/user/{id}", produces = "application/json") //== @RequestMapping(value="/user", method=GET)
    public User getUser(@PathVariable(value = "id") Long userId) {
        return userRepository.findOne(userId);
    }

    @PostMapping(path = "/user")
    public ResponseEntity addUser(@RequestParam String email, String password, String fullName) { // TODO change to required=true
        User user = new User(email, password, fullName);
        userRepository.save(user);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping(path = "/user")
    public String updateUser(@RequestParam(value = "user", required = false) User user) { // TODO change to required=true
        return "<p>This is user section, PUT method</p>, update existing user  by User object.</p>";
    }

    @DeleteMapping(path = "/user/{id}")
    public String deleteUser(@PathVariable(value = "id") Long userID) { // TODO change to required=true
        userRepository.delete(userID); // really delete? mb just mark boolean flag isDeleted in DB, but not del actually...
        return "<p>This is user section, DELETE method, delete existing user by userID.</p>";
    }

    @GetMapping(path = "/users", produces = "application/json")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
