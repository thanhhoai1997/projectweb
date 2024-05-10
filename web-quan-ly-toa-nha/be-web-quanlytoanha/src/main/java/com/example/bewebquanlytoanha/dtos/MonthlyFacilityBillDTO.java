package com.example.bewebquanlytoanha.dtos;

import com.example.bewebquanlytoanha.model.FacilityContract;
import com.example.bewebquanlytoanha.model.Month;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Data
public class MonthlyFacilityBillDTO {
    private Long id;
    private double totalAmount;
    private Date startDate;
    private Date endDate;
    private FacilityContractDTO facilityContract;
    private MonthDTO month;
}
