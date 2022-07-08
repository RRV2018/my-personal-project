package org.omsoft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClass {
    @GetMapping("/")
    public String getHello(){
        return "Hello User welcome in Spring";
    }
}
