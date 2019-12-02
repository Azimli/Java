package com.springcrud.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UsersController {
    @RequestMapping("/login")
    private String UserController(){
            return "login";
    }
}
