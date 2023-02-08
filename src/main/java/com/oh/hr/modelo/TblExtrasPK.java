package com.oh.hr.modelo;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TblExtrasPK implements Serializable {
    private Long mes;
    private Long anio;
    public TblExtrasPK() {
    }
    public TblExtrasPK(Long mes, Long anio) {
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
    public String toString() {
        return "TblExtrasPK{" +
                "mes=" + mes +
                ", anio=" + anio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblExtrasPK that = (TblExtrasPK) o;
        return Objects.equals(mes, that.mes) && Objects.equals(anio, that.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mes, anio);
    }
}
