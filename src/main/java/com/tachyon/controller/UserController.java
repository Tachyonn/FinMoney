package com.tachyon.controller;

import com.tachyon.domain.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser(@RequestParam int userId) {
        return "<p>This is user section, GET method, by userId</p>";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String postUser(@RequestParam(value = "user", required = false) User user) { // TODO change to required=true
        return "<p>This is user section, POST method</p>, creates new User";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String putUser(@RequestParam(value = "user", required = false) User user) { // TODO change to required=true
        return "<p>This is user section, PUT method</p>, update existing user  by User object.";
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public String deleteUser(@RequestParam(value = "userID", required = false) Long userID) { // TODO change to required=true
        return "<p>This is user section, DELETE method</p>, delete existing user by userID.";
    }
}
