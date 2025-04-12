package com.UTP.market.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${app.mensaje}")
    private String mensaje;

    @GetMapping("/entorno")
    public String mostrarEntorno() {
        return mensaje;
    }

    @GetMapping("/hola")
    public String saludar() {
        return "nunca pares de aprender!";
    }

    @GetMapping("/saludo")
    public String saludo(@RequestParam(defaultValue = "Mundo") String nombre) {
        String mensaje = "Hola " + nombre + "!";
        return mensaje.toUpperCase();
    }

    @GetMapping("/edad-futura/{nombre}/{edad}")
    public String edadFutura(@PathVariable String nombre, @PathVariable int edad) {

        String mensaje = "";
        int edadFutura = edad + 5;

        if (edad >= 30) {
            mensaje = "Hola Sr.";
        } else if (edad >= 15) {
            mensaje = "Hola joven ";
        } else {
            mensaje = "Hola niño ";
        }

        return mensaje + nombre + ", en 5 años tendrás " + edadFutura + " años, ";
    }

    @GetMapping("/fruta")
    public String fruta(@RequestParam String nombre) {
        return "La fruta " + nombre + " es rica en fibra.";
    }

    @GetMapping("/animal/{animal}")
    public String animalDomestico(@PathVariable String animal) {
        return "El " + animal + " es un animal doméstico.";
    }

    @GetMapping("/clima")
    public String verificarClima(@RequestParam String ciudad) {
        return "El clima en " + ciudad + " es soleado";
    }
}
