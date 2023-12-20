package com.zaggle.ems.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "ClientUser")
public class ClientUser {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID clientId;

    private int budget;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private UUID adminUserId;

    private boolean status;

    private UUID departmentId;

    private UUID branchId;

    private String employeeId;

    private LocalDate dateOfJoining;

    private UUID orderUserId;

    private UUID cityId;

    private boolean isDeleted;

    private int emsBudget;

    private int propelBudget;

    private UUID countryId;

    private String grade;

    private String workplaceFormat;

    private String performanceProfile;

    private String jobStatus;

    private String gender;

    private String educationQualification;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private UUID outOfOfficeId;

    private boolean outOfOfficeStatus;

    @Column(columnDefinition = "text")
    private String homeAddress;

    private String zipCode;

    private UUID stateId;

    @Column(columnDefinition = "uuid[] DEFAULT '{}'::uuid[]", name = "district_ids")
    private UUID districtIds;

    @Column(columnDefinition = "uuid[] DEFAULT '{}'::uuid[]", name = "propelRole_ids")
    private UUID propelRoleIds;

    @Column(columnDefinition = "jsonb")
    private String data;

    private String zone;

    private UUID reportingManager;

    private String virtualAccountNumber;

    private UUID designationId;

    private UUID propelClientZoneId;

    private String cities;
}
