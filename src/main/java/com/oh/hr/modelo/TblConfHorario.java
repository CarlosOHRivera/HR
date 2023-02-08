package com.oh.hr.modelo;

import javax.persistence.*;

@Entity
@Table(name = "TBL_CONF_HORARIO", schema = "HR", catalog = "")
public class TblConfHorario {
    @Id
    @Column(name = "ANIO", nullable = false, precision = 0, length = 4)
    private Long anio;
    @Basic
    @Column(name = "HORA_ENT", nullable = true, length = 4)
    private String horaEnt;
    @Basic
    @Column(name = "HORA_SAL", nullable = true, length = 4)
    private String horaSal;

    public TblConfHorario() {
        super();
    }

    public TblConfHorario( String horaEnt, String horaSal) {
        this.horaEnt = horaEnt;
        this.horaSal = horaSal;
    }

    public TblConfHorario(Long anio, String horaEnt, String horaSal) {
        this.anio = anio;
        this.horaEnt = horaEnt;
        this.horaSal = horaSal;
    }
}
