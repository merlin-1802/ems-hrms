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
@Table(name="ZaggleCard")
public class ZaggleCard {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID clientId;

    private String code;

    private String pin;

    private int originalValue;

    private float value;

    private int expiryDays;

    private LocalDateTime expiresAt;

    private LocalDateTime activatedAt;

    private UUID cityId;

    private UUID invoiceId;

    private boolean status;

    private boolean startLifeFromActivation;

    private String zscType;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    private UUID addressId;

//    @Type(type = "hstore")
    private String data;

    private String usage;

    @Column(columnDefinition = "uuid[] DEFAULT '{}'::uuid[]", name = "batch_ids")
    private UUID[] batchIds;

    private UUID adminUserId;

    private String urn;

    private LocalDateTime addedAt;

    private boolean isBlocked;

    private UUID userId;

    private UUID yseCardId;

    private UUID clientUserId;

    @Column(columnDefinition = "uuid[] DEFAULT '{}'::uuid[]", name = "yesWhitelistUser_ids")
    private UUID[] yesWhitelistUserIds;

    private String certificateUrl;

    private boolean isReloadable;

    private String rewardProgramType;

    private UUID rewardProgramId;

    @Column(columnDefinition = "uuid[] DEFAULT '{}'::uuid[]", name = "nsdlWhitelistedUser_ids")
    private UUID[] nsdlWhitelistedUserIds;

    private boolean visibility;
}
