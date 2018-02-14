package com.tachyon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @RequestMapping(value = "/")
    public String onIndex() {
        return "<h1>This is ROOT</h>";
    }
}
