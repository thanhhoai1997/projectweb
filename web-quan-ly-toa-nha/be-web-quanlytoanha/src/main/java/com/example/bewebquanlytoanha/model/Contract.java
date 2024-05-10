package com.example.bewebquanlytoanha.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startDate;
    private Date endDate;
    private double rentedArea;
    private String description;
    private int isCanceled;
    private String position;

    @ManyToOne
    @JoinColumn(name = "company_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Company company;

    @ManyToOne

    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JoinColumn(name = "floor_id")
    private Floor floor;

//    @Column(columnDefinition = "bit(1) default 0")
//    private Boolean isDeleted;


//    @JsonBackReference
//    @OneToMany(mappedBy = "contract",cascade = CascadeType.ALL)
//    private List<MonthlyBill> monthlyBills;

}
