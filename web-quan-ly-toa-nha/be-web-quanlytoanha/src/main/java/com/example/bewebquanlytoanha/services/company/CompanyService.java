package com.example.bewebquanlytoanha.services.company;

import com.example.bewebquanlytoanha.model.Company;
import com.example.bewebquanlytoanha.repositories.company.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyService {
    @Autowired
    private ICompanyRepository iCompanyRepository;
    @Override
    public Page<Company> findAll(Pageable pageable) {
        return iCompanyRepository.findAll(pageable);
    }
}
