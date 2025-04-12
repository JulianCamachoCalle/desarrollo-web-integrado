package com.UTP.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operar")
public class OperatorController {

    @GetMapping("/sumar")
    public String sumar(@RequestParam int a, @RequestParam int b) {
        return "La suma es: " + (a + b);
    }

    @GetMapping("/restar")
    public String restar(@RequestParam int a, @RequestParam int b) {
        return "La resta es: " + (a - b);
    }

    @GetMapping("/multiplicar")
    public String multiplicar(@RequestParam int a, @RequestParam int b) {
        return "La multiplicación es: " + (a * b);
    }

    @GetMapping("/division")
    public String division(@RequestParam int a, @RequestParam int b) {
        return "La division es: " + (a / b);
    }
}
