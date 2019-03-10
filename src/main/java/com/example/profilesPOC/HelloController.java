package com.example.profilesPOC;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/V1")
public class HelloController {

    @Value("${saludo}")
    private String cadena;

    @GetMapping("/hola")
    public String getSaludo(){
        return cadena;
    }


}
