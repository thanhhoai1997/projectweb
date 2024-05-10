package com.example.bewebquanlytoanha.services.company_employee;

import com.example.bewebquanlytoanha.model.CompanyEmployee;
import com.example.bewebquanlytoanha.repositories.company.ICompanyEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyEmployeeService implements ICompanyEmployeeService {
    @Autowired
    private ICompanyEmployeeRepository iCompanyEmployeeRepository;
    @Override
    public List<CompanyEmployee> findAll() {
        return iCompanyEmployeeRepository.findAll();
    }

    @Override
    public Integer countCompanyEmployeeByIdCompany(Long id) {
        return iCompanyEmployeeRepository.countCompanyEmployeeByCompanyId(id);
    }
}
