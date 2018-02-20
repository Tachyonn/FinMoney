package com.tachyon.controller;

import com.tachyon.domain.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController // == @Controller + @ResponseBody
public class UserController {

    @GetMapping(path = "/user") //== @RequestMapping(value="/user", method=GET)
    public String getUser(@RequestParam(value = "userId", required = false) Long userId) {
        return "<p>This is user section, GET method, by userId</p>"; // always @ResponseBody because of @RestController annotation
    }

    @PostMapping(path = "/user")
    public String addUser(@RequestParam(value = "user", required = false) User user) { // TODO change to required=true
        return "<p>This is user section, POST method</p>, creates new User";
    }

    @PutMapping(path = "/user")
    public String updateUser(@RequestParam(value = "user", required = false) User user) { // TODO change to required=true
        return "<p>This is user section, PUT method</p>, update existing user  by User object.";
    }

    @DeleteMapping(path = "/user")
    public String deleteUser(@RequestParam(value = "userID", required = false) Long userID) { // TODO change to required=true
        return "<p>This is user section, DELETE method</p>, delete existing user by userID.";
    }

    @GetMapping(path = "/users")
    public String getAllUsers() {
        return "<p>This is user section, get all users.";
    }
}
