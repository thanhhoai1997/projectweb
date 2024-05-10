package com.example.bewebquanlytoanha.dtos;

import com.example.bewebquanlytoanha.model.Contract;
import com.example.bewebquanlytoanha.model.Month;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
public class MonthlyBillDTO {
    private Long id;
    private double totalAmount;
    private ContractDTO contract;
    private MonthDTO month;
}
