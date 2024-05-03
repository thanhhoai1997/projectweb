package com.example.bewebquanlytoanha.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Entity
@Table(name = "company_employee")
@NoArgsConstructor
public class CompanyEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idCard;
    private String name;
    private Date dateOfBirth;
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;



}
