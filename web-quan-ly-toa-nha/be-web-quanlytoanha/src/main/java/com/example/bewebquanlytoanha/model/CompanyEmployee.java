package com.example.bewebquanlytoanha.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "company_id",nullable = false)
    private Company company;



}
