package com.oh.hr.modelo;

import javax.persistence.*;

@Entity
@Table(name = "TBL_TARDIAS", schema = "HR", catalog = "")
public class TblTardias {
    @EmbeddedId
    private TblTardiasPK llave;
    @Basic
    @Column(name = "EMPLOYEE_ID", nullable = true, precision = 0)
    private Long employeeId;
    @Basic
    @Column(name = "TIEMPO_TARDE", nullable = true, precision = 0)
    private Long tiempoTarde;
    @Basic
    @Column(name = "VALOR_TARDE", nullable = true, precision = 4)
    private Long valorTarde;

    public TblTardias() {
        super();
    }

    public TblTardias(TblTardiasPK llave, Long employeeId, Long tiempoTarde, Long valorTarde) {
        this.llave = llave;
        this.employeeId = employeeId;
        this.tiempoTarde = tiempoTarde;
        this.valorTarde = valorTarde;
    }

    public TblTardiasPK getLlave() {
        return llave;
    }

    public void setLlave(TblTardiasPK llave) {
        this.llave = llave;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getTiempoTarde() {
        return tiempoTarde;
    }

    public void setTiempoTarde(Long tiempoTarde) {
        this.tiempoTarde = tiempoTarde;
    }

    public Long getValorTarde() {
        return valorTarde;
    }

    public void setValorTarde(Long valorTarde) {
        this.valorTarde = valorTarde;
    }

    @Override
    public String toString() {
        return "TblTardias{" +
                "llave=" + llave +
                ", employeeId=" + employeeId +
                ", tiempoTarde=" + tiempoTarde +
                ", valorTarde=" + valorTarde +
                '}';
    }
}
