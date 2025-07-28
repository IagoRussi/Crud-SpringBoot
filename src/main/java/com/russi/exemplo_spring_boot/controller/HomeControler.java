package com.russi.exemplo_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeControler {

    @GetMapping("/")
    public String helloWorld() {
        return "Database Funcionando 1";
    }
}
