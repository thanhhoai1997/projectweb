package com.example.bewebquanlytoanha.services.contract;

import com.example.bewebquanlytoanha.dtos.ContractDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<ContractDTO> findAll(Pageable pageable);
}
