package com.oh.hr.modelo;

import javax.persistence.*;

@Entity
@Table(name = "TBL_CALCULO_MES", schema = "HR", catalog = "")

public class TblCalculoMes {
    @EmbeddedId
    private TblCalculoMesPK llave;
    @Basic
    @Column(name = "EMPLOYEE_ID", nullable = true, precision = 0)
    private Long employeeId;
    @Basic
    @Column(name = "SALARIO", nullable = true, precision = 2)
    private Long salario;
    @Basic
    @Column(name = "EXTRA", nullable = true, precision = 2)
    private Long extra;
    @Basic
    @Column(name = "DESCUENTO", nullable = true, precision = 2)
    private Long descuento;
    @Basic
    @Column(name = "TOTAL", nullable = true, precision = 2)
    private Long total;

    public TblCalculoMes() {
        super();
    }

    public TblCalculoMes(Long employeeId, Long salario, Long extra, Long descuento, Long total) {
        this.employeeId = employeeId;
        this.salario = salario;
        this.extra = extra;
        this.descuento = descuento;
        this.total = total;
    }


    public TblCalculoMes(TblCalculoMesPK llave, Long employeeId, Long salario, Long extra, Long descuento, Long total) {
        this.llave = llave;
        this.employeeId = employeeId;
        this.salario = salario;
        this.extra = extra;
        this.descuento = descuento;
        this.total = total;
    }

    public TblCalculoMesPK getLlave() {
        return llave;
    }

    public void setLlave(TblCalculoMesPK llave) {
        this.llave = llave;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    public Long getExtra() {
        return extra;
    }

    public void setExtra(Long extra) {
        this.extra = extra;
    }

    public Long getDescuento() {
        return descuento;
    }

    public void setDescuento(Long descuento) {
        this.descuento = descuento;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "TblCalculoMes{" +
                "llave=" + llave +
                ", employeeId=" + employeeId +
                ", salario=" + salario +
                ", extra=" + extra +
                ", descuento=" + descuento +
                ", total=" + total +
                '}';
    }
}
