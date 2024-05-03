package com.example.bewebquanlytoanha.services.company;

import com.example.bewebquanlytoanha.model.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICompanyService {

    Page<Company> findAll(Pageable pageable);
}
