package com.oh.hr.repositorio;

import com.oh.hr.modelo.TblCalculoMes;
import com.oh.hr.modelo.TblCalculoMesPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TblCalculoMesRepositorio extends JpaRepository<TblCalculoMes, TblCalculoMesPK> {
}
