package com.zaggle.ems.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String email;

    @Column(columnDefinition = "uuid[] DEFAULT '{}'::uuid[]", name = "zaggleCard_ids")
    private UUID zaggleCardIds;

    private String image;

    private UUID addressId;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private String phones;

    private String emails;

    private String phone;

    private int points;

    private boolean isPhoneVerified;

}
