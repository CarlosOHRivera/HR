package com.oh.hr.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ConsultaControlador {
    @GetMapping({"/Consulta","/consulta"})
    public String consulta(){
        return "consulta_salario";
    }
}
