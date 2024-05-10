package com.example.bewebquanlytoanha.services.contract;

import com.example.bewebquanlytoanha.dtos.ContractDTO;
import com.example.bewebquanlytoanha.model.Contract;
import com.example.bewebquanlytoanha.repositories.contract.IContractRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Page<ContractDTO> findAll(Pageable pageable) {
        Page<Contract> contracts = iContractRepository.findAll(pageable);
        Page<ContractDTO> contractDTOS = contracts.map(contract -> modelMapper.map(contract,ContractDTO.class));
        return contractDTOS;
    }
}
