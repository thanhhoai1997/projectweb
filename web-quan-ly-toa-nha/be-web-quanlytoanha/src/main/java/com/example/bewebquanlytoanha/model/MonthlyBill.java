package com.example.bewebquanlytoanha.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@Entity
@NoArgsConstructor
@Table(name = "monthly_bill")
public class MonthlyBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double totalAmount;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Contract contract;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "month_id")
    private Month month;
}
