package com.example.bewebquanlytoanha.dtos;

import lombok.Data;

@Data
public class FloorDTO {
    private Long id;
    private String name;
    private double pricePerM2;
    private double groundArea;
}
