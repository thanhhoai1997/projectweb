package com.example.bewebquanlytoanha.dtos;

import lombok.Data;

import java.util.Date;
@Data
public class ContractDTO {
    private Long id;
    private Date startDate;
    private Date endDate;
    private double rentedArea;
    private String description;
    private int isCanceled;
    private String position;
   private CompanyDTO company;
   private FloorDTO floor;
}
