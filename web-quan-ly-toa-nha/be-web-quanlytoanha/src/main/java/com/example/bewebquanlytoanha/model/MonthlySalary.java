package com.example.bewebquanlytoanha.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@Entity
@NoArgsConstructor
@Table(name = "monthly_salary")
public class MonthlySalary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double salary;
    private String empName;
    private String address;
    private String phoneNumber;
    private String position;
    private int salaryLevel;

    @ManyToOne
    @JoinColumn(name = "building_employee_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private BuildingEmployee buildingEmployee;

    @ManyToOne
    @JoinColumn(name = "month_name")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Month month;
}
