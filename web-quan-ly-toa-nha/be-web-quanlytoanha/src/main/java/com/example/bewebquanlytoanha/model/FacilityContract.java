package com.example.bewebquanlytoanha.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "facility_contract")
@NoArgsConstructor
public class FacilityContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startDate;
    private String description;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "facility_id")
    private Facility facility;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "company_id")
    private Company company;

//    @JsonBackReference
//    @OneToMany(mappedBy = "facilityContract",cascade = CascadeType.ALL)
//    private List<MonthlyFacilityBill> monthlyFacilityBills;
}
