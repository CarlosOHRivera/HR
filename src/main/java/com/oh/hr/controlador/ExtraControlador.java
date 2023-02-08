package com.oh.hr.controlador;

import com.oh.hr.clases.Atributos;
import com.oh.hr.modelo.TblExtras;
import com.oh.hr.modelo.TblExtrasPK;
import com.oh.hr.repositorio.TblExtrasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class ExtraControlador {

    @Autowired
    TblExtrasRepositorio tblExtrasRepositorio;

    @GetMapping({"extra", "Extra"})
    public String getExtraForm(Model model) {
    /*    List<Atributos> listaAtributos = new ArrayList<Atributos>();
        TblExtras extraForm =new TblExtras();
        TblExtrasPK extraPK=new TblExtrasPK();
        Atributos at1=new Atributos(extraForm);
        Atributos at2=new Atributos(extraPK);
        listaAtributos.add(at1);
        listaAtributos.add(at2);
        model.addAttribute("listaAttr", listaAtributos);*/
        model.addAttribute("extra", new TblExtras());
        model.addAttribute("extraPK", new TblExtrasPK());
        return "mto_extra";
    }

    @PostMapping("/guardarExtra")
    public void GuardarProducto(@RequestBody TblExtras tblExtras) {
        tblExtrasRepositorio.save(tblExtras);
    }

public void leerDisco(String directorio){

}

}
