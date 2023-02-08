package com.oh.hr.repositorio;

import com.oh.hr.modelo.TblTardias;
import com.oh.hr.modelo.TblTardiasPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TblTardiasRepositorio extends JpaRepository<TblTardias, TblTardiasPK> {
}
