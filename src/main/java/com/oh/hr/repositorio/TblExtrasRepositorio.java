package com.oh.hr.repositorio;

import com.oh.hr.modelo.TblExtras;
import com.oh.hr.modelo.TblExtrasPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TblExtrasRepositorio extends JpaRepository<TblExtras, TblExtrasPK> {
}
