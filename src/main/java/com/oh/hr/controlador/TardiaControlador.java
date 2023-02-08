package com.oh.hr.controlador;

import com.oh.hr.modelo.TblTardias;
import com.oh.hr.repositorio.TblTardiasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TardiaControlador {
    @Autowired
    TblTardiasRepositorio tblTardiasRepositorio;

    @GetMapping({"/Tardia","/tardia"})
    public String tardia(Model model){
        model.addAttribute("tardiaForm", new TblTardias());
        return "mto_tardia";
    }

    @PostMapping("/guardarTardia")
    public void GuardarTardias(@RequestBody TblTardias tblTardias) {
        tblTardiasRepositorio.save(tblTardias);
    }
}
