package com.springcrud.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @RequestMapping("/")
    private String UserController(){
            return "index";
    }
}
