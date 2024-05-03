package com.example.bewebquanlytoanha.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity

@Table(name = "building_employee")
@NoArgsConstructor
public class BuildingEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date dayOfBirth;
    private String address;
    private String phoneNumber;
    private String position;
    @ManyToOne
    @JoinColumn(name = "salary_id")
    private Salary salary;

    @JsonBackReference
    @OneToMany(mappedBy = "buildingEmployee",cascade = CascadeType.ALL)
    private List<MonthlySalary> monthlySalaries;

    @JsonBackReference
    @OneToMany(mappedBy = "buildingEmployee",cascade = CascadeType.ALL)
    private List<Word> words;

}
