package com.oh.hr.clases;

import com.oh.hr.modelo.TblExtras;
import com.oh.hr.modelo.TblExtrasPK;

public class Atributos {
    String nombreAtributo;
    public Atributos() {
        super();
    }

    public Atributos(String nombreAtributo) {
        this.nombreAtributo = nombreAtributo;
    }

    public Atributos(TblExtras extraForm) {
    }

    public Atributos(TblExtrasPK extraPK) {
    }

    public String getNombreAtributo() {
        return nombreAtributo;
    }

    public void setNombreAtributo(String nombreAtributo) {
        this.nombreAtributo = nombreAtributo;
    }
}
