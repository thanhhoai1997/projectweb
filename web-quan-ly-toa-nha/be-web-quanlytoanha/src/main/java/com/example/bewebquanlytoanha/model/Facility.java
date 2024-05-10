package com.example.bewebquanlytoanha.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Entity
@NoArgsConstructor
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private double price;
    private int required;

//    @JsonBackReference
//    @OneToMany(mappedBy = "facility",cascade = CascadeType.ALL)
//    private List<Salary> salaries;
//
//    @JsonBackReference
//    @OneToMany(mappedBy = "facility",cascade = CascadeType.ALL)
//    private List<FacilityContract> facilityContracts;

}
