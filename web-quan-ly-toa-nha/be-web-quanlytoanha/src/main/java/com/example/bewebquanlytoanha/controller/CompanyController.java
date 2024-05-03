package com.example.bewebquanlytoanha.controller;

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
@RequestMapping("/companys")
public class CompanyController {

    @Autowired
    private ICompanyService iCompanyService;

    @GetMapping("")
    public ResponseEntity<Iterable<Company>> findAllCompany(@RequestParam("page") Optional<Integer> page) {
        Pageable pageable = PageRequest.of(page.orElse(0),3);
        Page<Company> companies = iCompanyService.findAll(pageable);

        return  new ResponseEntity<>(companies, HttpStatus.OK);

    }
}
