package com.example.bewebquanlytoanha.repositories.company;

import com.example.bewebquanlytoanha.model.CompanyEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompanyEmployeeRepository extends JpaRepository<CompanyEmployee,Long> {

//@Query("select count (*) from CompanyEmployee where CompanyEmployee.company.id = :id ")
    Integer countCompanyEmployeeByCompanyId(Long id);
}
