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
@Table(name = "AdminUsers")
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @Column(columnDefinition = "uuid[] DEFAULT '{}'::uuid[]", name = "role_ids")
    private UUID roleIds;

    private String email;

    private String encryptedPassword;

    private String resetPasswordToken;

    @Column(columnDefinition = "inet")
    private String resetPasswordSentIp;

    @Column(columnDefinition = "inet")
    private String lastSignInIp;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private boolean status;

    private String phone;

    private UUID organizationId;

    private String organizationType;

    @Column(columnDefinition = "uuid[] DEFAULT '{}'::uuid[]", name = "save_role_ids")
    private UUID saveRoleIds;

    private String image;

    private String encryptedPasscode;

    private String resetToken;

    private String defaultClient;

    private String confirmationToken;

    private LocalDateTime confirmedAt;

    private LocalDateTime confirmationSentAt;

    private String unconfirmedEmail;

    private LocalDate dateOfBirth;
}
