package com.example.bewebquanlytoanha.controller;

import com.example.bewebquanlytoanha.model.CompanyEmployee;
import com.example.bewebquanlytoanha.services.company_employee.ICompanyEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/company-employee")
public class CompanyEmployeeController {
    @Autowired
    private ICompanyEmployeeService iCompanyEmployeeService;

    @GetMapping("")
    public ResponseEntity<List<CompanyEmployee>> getAllCompanyEmployee() {
        return new ResponseEntity<>(iCompanyEmployeeService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/countEmployee/{id}")
    public ResponseEntity<Integer> countEmployee(@PathVariable("id") Long id) {
        Integer number = iCompanyEmployeeService.countCompanyEmployeeByIdCompany(id);
        return new ResponseEntity<>(number, HttpStatus.OK);
    }
}
