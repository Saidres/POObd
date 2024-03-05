package com.firstProject.poo.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")

public class FirstController {
    @GetMapping("/welcome")
    public String firstHello(){
        return "Hola UCC";
    }
}
