package com.example.bewebquanlytoanha.dtos;

import com.example.bewebquanlytoanha.model.Salary;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Data
public class BuildingEmployeeDTO {
    private Long id;
    private String name;
    private Date dayOfBirth;
    private String address;
    private String phoneNumber;
    private String position;
    private SalaryDTO salary;
}
