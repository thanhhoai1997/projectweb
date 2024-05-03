package com.example.bewebquanlytoanha.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Entity
@NoArgsConstructor

public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double salary;
    private int salaryLevel;
    @JsonBackReference
    @OneToMany(mappedBy = "salary",cascade = CascadeType.ALL)
    private List<BuildingEmployee> buildingEmployees;


    @ManyToOne
    @JoinColumn(name = "facility_id")
    private Facility facility;
}
