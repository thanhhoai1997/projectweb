package com.example.bewebquanlytoanha.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Month {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int month;
    private int year;

//    @JsonBackReference
//    @OneToMany(mappedBy = "month",cascade = CascadeType.ALL)
//    List<MonthlyFacilityBill> monthlyFacilityBills;
//
//    @JsonBackReference
//    @OneToMany(mappedBy = "month",cascade = CascadeType.ALL)
//    List<MonthlySalary> monthlySalaries;
//
//    @JsonBackReference
//    @OneToMany(mappedBy = "month",cascade = CascadeType.ALL)
//    List<MonthlyBill> monthlyBills;

}
