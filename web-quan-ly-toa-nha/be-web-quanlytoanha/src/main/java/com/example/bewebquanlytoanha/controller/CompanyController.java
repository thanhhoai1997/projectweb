package com.example.bewebquanlytoanha.controller;

import com.example.bewebquanlytoanha.dtos.CompanyDTO;
import com.example.bewebquanlytoanha.model.Company;
import com.example.bewebquanlytoanha.services.company.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private ICompanyService iCompanyService;

    @GetMapping("")
    public ResponseEntity<Iterable<CompanyDTO>> findAllCompany(@RequestParam("page") Optional<Integer> page) {
        Pageable pageable = PageRequest.of(page.orElse(0),3);
        Page<CompanyDTO> companies = iCompanyService.findAll(pageable);
        return  new ResponseEntity<>(companies, HttpStatus.OK);

    }
    @PostMapping(value = "",consumes = "application/json;charset=UTF-8")
    public ResponseEntity<CompanyDTO> saveCompany(@RequestBody CompanyDTO companyDTO){
        iCompanyService.save(companyDTO);
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<CompanyDTO> getCompanyById(@PathVariable("id") Long id){

        return new ResponseEntity<>(iCompanyService.findById(id),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public  ResponseEntity<CompanyDTO> updateCompanyById(@PathVariable("id") Long id,@RequestBody CompanyDTO companyDTO){
        companyDTO.setId(id);
        iCompanyService.save(companyDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public  ResponseEntity<Company> deleteCompanyById(@PathVariable("id") Long id){
        iCompanyService.deleteById(id);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
