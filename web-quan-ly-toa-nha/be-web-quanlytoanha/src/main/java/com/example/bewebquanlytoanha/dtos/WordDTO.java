package com.example.bewebquanlytoanha.dtos;

import com.example.bewebquanlytoanha.model.BuildingEmployee;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
public class WordDTO {
    private Long id;
    private String title;
    private String detail;
    private String startDate;
    private String endDate;
    private String assigner;
    private BuildingEmployeeDTO buildingEmployee;
}
