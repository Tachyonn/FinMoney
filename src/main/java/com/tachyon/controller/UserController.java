package com.tachyon.controller;

import com.tachyon.domain.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping(path = "/user")
    public @ResponseBody String getUser(@RequestParam int userId) {
        return "<p>This is user section, GET method, by userId</p>";
    }

    @PostMapping(path = "/user")
    public @ResponseBody String postUser(@RequestParam(value = "user", required = false) User user) { // TODO change to required=true
        return "<p>This is user section, POST method</p>, creates new User";
    }

    @PutMapping(path = "/user")
    public @ResponseBody String putUser(@RequestParam(value = "user", required = false) User user) { // TODO change to required=true
        return "<p>This is user section, PUT method</p>, update existing user  by User object.";
    }

    @DeleteMapping(path = "/user")
    public @ResponseBody String deleteUser(@RequestParam(value = "userID", required = false) Long userID) { // TODO change to required=true
        return "<p>This is user section, DELETE method</p>, delete existing user by userID.";
    }

    @GetMapping(path = "/users")
    public @ResponseBody String getAllUsers(){
        return "<p>This is user section, get all users.";
    }
}
