package com.example.bewebquanlytoanha.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startDate;
    private Date endDate;
    private double rentedArea;
    private String description;
    private int isCanceled;
    private String position;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "floor_id")
    private Floor floor;

    @JsonBackReference
    @OneToMany(mappedBy = "contract",cascade = CascadeType.ALL)
    private List<MonthlyBill> monthlyBills;

}
