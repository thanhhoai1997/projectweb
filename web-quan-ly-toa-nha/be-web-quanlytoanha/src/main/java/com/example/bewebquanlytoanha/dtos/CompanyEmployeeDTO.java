package com.example.bewebquanlytoanha.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class CompanyEmployeeDTO {
    private Long id;
    private String idCard;
    private String name;
    private Date dateOfBirth;
    private String phoneNumber;
    CompanyDTO company;
}
