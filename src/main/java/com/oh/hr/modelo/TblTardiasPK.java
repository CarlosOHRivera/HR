package com.oh.hr.modelo;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TblTardiasPK implements Serializable {
    private Long mes;
    private Long anio;

    public TblTardiasPK() {
        super();
    }
    public TblTardiasPK(Long mes, Long anio) {
        this.mes = mes;
        this.anio = anio;
    }

    public Long getMes() {
        return mes;
    }

    public void setMes(Long mes) {
        this.mes = mes;
    }

    public Long getAnio() {
        return anio;
    }

    public void setAnio(Long anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblTardiasPK that = (TblTardiasPK) o;
        return Objects.equals(mes, that.mes) && Objects.equals(anio, that.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mes, anio);
    }

    @Override
    public String toString() {
        return "TblTardiasPK{" +
                "mes=" + mes +
                ", anio=" + anio +
                '}';
    }
}
