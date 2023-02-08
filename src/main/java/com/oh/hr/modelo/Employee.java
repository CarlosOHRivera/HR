package com.oh.hr.modelo;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false, precision = 0)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    @Basic
    @Column(name = "FIRST_NAME", nullable = true, length = 20)
    private String firstName;

    @Basic
    @Column(name = "LAST_NAME", nullable = false, length = 25)
    private String lastName;
    @Basic
    @Column(name = "EMAIL", nullable = false, length = 25)
    private String email;
    @Basic
    @Column(name = "PHONE_NUMBER", nullable = true, length = 20)
    private String phoneNumber;

    @Basic
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "HIRE_DATE", nullable = false)
    private Date hireDate;
    @Basic
    @Column(name = "JOB_ID", nullable = false, length = 12)
    private String jobId;
    @Basic
    @Column(name = "SALARY", nullable = true, precision = 2)
    private Long salary;

    @Basic
    @Column(name = "COMMISSION_PCT", nullable = true, precision = 2)
    private Long commissionPct;

    @Basic
    @Column(name = "MANAGER_ID", nullable = true, precision = 0)
    private Long managerId;
    @Basic
    @Column(name = "DEPARTMENT_ID", nullable = true, precision = 0)
    private Long departmentId;

    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, String jobId, Long salary, Long commissionPct, Long managerId, Long departmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.jobId = jobId;
        this.salary = salary;
        this.commissionPct = commissionPct;
        this.managerId = managerId;
        this.departmentId = departmentId;
    }

    public Employee(Long employeeId, String firstName, String lastName, String email, String phoneNumber, Date hireDate, String jobId, Long salary, Long commissionPct, Long managerId, Long departmentId) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.jobId = jobId;
        this.salary = salary;
        this.commissionPct = commissionPct;
        this.managerId = managerId;
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate=" + hireDate +
                ", jobId='" + jobId + '\'' +
                ", salary=" + salary +
                ", commissionPct=" + commissionPct +
                ", managerId=" + managerId +
                ", departmentId=" + departmentId +
                '}';
    }
}
