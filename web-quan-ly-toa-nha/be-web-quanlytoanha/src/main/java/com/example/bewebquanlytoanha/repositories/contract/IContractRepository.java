package com.example.bewebquanlytoanha.repositories.contract;

import com.example.bewebquanlytoanha.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends JpaRepository<Contract,Long> {
}
