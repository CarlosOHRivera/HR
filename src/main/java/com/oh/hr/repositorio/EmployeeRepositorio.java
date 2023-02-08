package com.oh.hr.repositorio;

import com.oh.hr.modelo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositorio extends JpaRepository<Employee,Long> {

}
