package com.example.bewebquanlytoanha.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name = "monthly_facility_bill")
public class MonthlyFacilityBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double totalAmount;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "facility_contract_id")
    private FacilityContract facilityContract;

    @ManyToOne
    @JoinColumn(name = "month_id")
    private Month month;
}
