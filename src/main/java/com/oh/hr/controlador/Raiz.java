package com.oh.hr.controlador;


import org.springframework.web.bind.annotation.GetMapping;

public class Raiz {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
