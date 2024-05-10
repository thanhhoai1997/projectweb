package com.example.bewebquanlytoanha.services.company_employee;

import com.example.bewebquanlytoanha.model.CompanyEmployee;

import java.util.List;

public interface ICompanyEmployeeService {
    List<CompanyEmployee> findAll();

    Integer countCompanyEmployeeByIdCompany(Long id);
}
