package com.example.bewebquanlytoanha.repositories.company;

import com.example.bewebquanlytoanha.model.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompanyRepository extends JpaRepository<Company,Long> {
    Page<Company> findAll(Pageable pageable);
}
