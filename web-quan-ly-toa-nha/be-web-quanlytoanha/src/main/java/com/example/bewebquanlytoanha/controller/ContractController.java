package com.example.bewebquanlytoanha.controller;

import com.example.bewebquanlytoanha.dtos.CompanyDTO;
import com.example.bewebquanlytoanha.dtos.ContractDTO;
import com.example.bewebquanlytoanha.services.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/contract")
@CrossOrigin("*")
public class ContractController {
    @Autowired
    private IContractService iContractService;

    @GetMapping("")
    public ResponseEntity<Iterable<ContractDTO>> findAllContract(@RequestParam("page") Optional<Integer> page){
        Pageable pageable = PageRequest.of(page.orElse(0),3);
        Page<ContractDTO> contractDTOS = iContractService.findAll(pageable);
        return  new ResponseEntity<>(contractDTOS, HttpStatus.OK);
    }
}
