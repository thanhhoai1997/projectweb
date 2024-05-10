package com.example.bewebquanlytoanha.dtos;

import lombok.Data;

@Data
public class CompanyDTO {
    private Long id;
    private String name;
    private String taxCode;
    private double authorizedCapital;
    private String activeField;
    private String addressInBuilding;
    private String phoneNumber;
    private double area;
}
