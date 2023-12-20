package com.zaggle.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EmployeeMasterSettings")
public class EmployeeMasterSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID clientId;

    private String columnName;

    private String columnType;

    private boolean isRequired;

    private boolean isDisabled;

    private String options;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private boolean isEditable;

    private boolean viewInPdf;

    private boolean isDefault;

//    @Type(type = "hstore")
    private String optionsData;

    private String projects;

    private String costCenters;

    private String employeeGrades;

    private String categories;

    private Integer priority;

}
