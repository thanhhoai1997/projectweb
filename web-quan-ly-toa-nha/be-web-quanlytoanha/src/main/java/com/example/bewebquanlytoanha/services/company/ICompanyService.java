package com.example.bewebquanlytoanha.services.company;

import com.example.bewebquanlytoanha.dtos.CompanyDTO;
import com.example.bewebquanlytoanha.model.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICompanyService {

    Page<CompanyDTO> findAll(Pageable pageable);

    void save(CompanyDTO companyDTO);


    CompanyDTO findById(Long id);

    void deleteById(Long id);
}
