package com.example.bewebquanlytoanha.dtos;

import lombok.Data;

@Data
public class SalaryDTO {
    private Long id;
    private double salary;
    private int salaryLevel;
    private FacilityDTO facility;
}
