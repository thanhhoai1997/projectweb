package com.example.bewebquanlytoanha.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class FacilityContractDTO {
    private Long id;
    private Date startDate;
    private String description;
    private CompanyDTO company;
    private FacilityDTO facility;
}
