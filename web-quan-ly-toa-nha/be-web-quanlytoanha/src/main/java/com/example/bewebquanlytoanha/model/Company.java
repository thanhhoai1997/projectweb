package com.example.bewebquanlytoanha.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Entity
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String taxCode;
    private double authorizedCapital;
    private String activeField;
    private String addressInBuilding;
    private String phoneNumber;
    private double area;
    @JsonBackReference
    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)

    private List<CompanyEmployee> companyEmployees;


    @JsonBackReference
    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private List<Contract> contracts;

    @JsonBackReference
    @OneToMany(mappedBy = "company",cascade = CascadeType.ALL)
    private List<FacilityContract> facilityContracts;

}
