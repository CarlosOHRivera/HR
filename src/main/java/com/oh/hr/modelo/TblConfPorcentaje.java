package com.oh.hr.modelo;

import javax.persistence.*;

@Entity
@Table(name = "TBL_CONF_PORCENTAJE", schema = "HR", catalog = "")
public class TblConfPorcentaje {
    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    private Long id;
    @Basic
    @Column(name = "PORCENTAJE_DESC", nullable = true, precision = 2)
    private Long porcentajeDesc;

    public TblConfPorcentaje() {
        super();
    }

    public TblConfPorcentaje( Long porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }

    public TblConfPorcentaje(Long id, Long porcentajeDesc) {
        this.id = id;
        this.porcentajeDesc = porcentajeDesc;
    }
}
