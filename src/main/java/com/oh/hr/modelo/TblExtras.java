package com.oh.hr.modelo;

import javax.persistence.*;

@Entity
@Table(name = "TBL_EXTRAS", schema = "HR", catalog = "")

public class TblExtras {
    @EmbeddedId
    private TblExtrasPK llave;
    @Basic
    @Column(name = "EMPLOYEE_ID", nullable = true, precision = 0)
    private Long employeeId;
    @Basic
    @Column(name = "TIEMPO_EXTRA", nullable = true, precision = 0)
    private Long tiempoExtra;
    @Basic
    @Column(name = "VALOR_EXTRA", nullable = true, precision = 2)
    private Long valorExtra;

    public TblExtras() {
        super();
    }

    public TblExtras(Long employeeId, Long tiempoExtra, Long valorExtra) {
        this.employeeId = employeeId;
        this.tiempoExtra = tiempoExtra;
        this.valorExtra = valorExtra;
    }

    public TblExtras(TblExtrasPK llave, Long employeeId, Long tiempoExtra, Long valorExtra) {
        this.llave = llave;
        this.employeeId = employeeId;
        this.tiempoExtra = tiempoExtra;
        this.valorExtra = valorExtra;
    }

    public TblExtrasPK getLlave() {
        return llave;
    }

    public void setLlave(TblExtrasPK llave) {
        this.llave = llave;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getTiempoExtra() {
        return tiempoExtra;
    }

    public void setTiempoExtra(Long tiempoExtra) {
        this.tiempoExtra = tiempoExtra;
    }

    public Long getValorExtra() {
        return valorExtra;
    }

    public void setValorExtra(Long valorExtra) {
        this.valorExtra = valorExtra;
    }

    @Override
    public String toString() {
        return "TblExtras{" +
                "llave=" + llave +
                ", employeeId=" + employeeId +
                ", tiempoExtra=" + tiempoExtra +
                ", valorExtra=" + valorExtra +
                '}';
    }
}
