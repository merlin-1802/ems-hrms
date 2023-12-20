package com.zaggle.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UserDTO {
    private UUID id;
    private String email;

    private UUID[] zaggleCardIds;

    private String image;

    private UUID addressId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String phones;

    private String emails;

    private String phone;

    private int points;

    private boolean isPhoneVerified;
}
