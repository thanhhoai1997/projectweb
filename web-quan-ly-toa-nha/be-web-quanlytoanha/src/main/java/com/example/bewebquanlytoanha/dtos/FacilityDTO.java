package com.example.bewebquanlytoanha.dtos;

import lombok.Data;

@Data
public class FacilityDTO {
    private Long id;
    private String name;
    private String type;
    private double price;
    private int required;
}
