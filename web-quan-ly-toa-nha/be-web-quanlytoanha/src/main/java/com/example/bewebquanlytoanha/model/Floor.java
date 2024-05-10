package com.example.bewebquanlytoanha.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor

public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double pricePerM2;
    private double groundArea;


//    @JsonBackReference
//    @OneToMany(mappedBy = "floor",cascade = CascadeType.ALL)
//    private List<Contract> contracts;
}
