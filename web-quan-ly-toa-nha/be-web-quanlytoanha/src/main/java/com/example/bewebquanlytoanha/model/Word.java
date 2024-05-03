package com.example.bewebquanlytoanha.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String detail;
    private String startDate;
    private String endDate;
    private String assigner;

    @ManyToOne
    @JoinColumn(name = "buildingEmployee_id")
    private BuildingEmployee buildingEmployee;
}
