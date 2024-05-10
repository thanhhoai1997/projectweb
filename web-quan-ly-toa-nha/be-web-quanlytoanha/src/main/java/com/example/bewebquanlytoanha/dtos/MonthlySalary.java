package com.example.bewebquanlytoanha.dtos;

import com.example.bewebquanlytoanha.model.BuildingEmployee;
import com.example.bewebquanlytoanha.model.Month;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
public class MonthlySalary {
    private Long id;
    private double salary;
    private String empName;
    private String address;
    private String phoneNumber;
    private String position;
    private int salaryLevel;
    private BuildingEmployeeDTO buildingEmployee;
    private MonthDTO month;
}
