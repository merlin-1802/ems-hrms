package com.zaggle.ems.repository;

import com.zaggle.ems.entity.ClientUser;
import com.zaggle.ems.entity.EmployeeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface EmployeeUserRepository extends JpaRepository<EmployeeUser, UUID> {
    Optional<EmployeeUser> findByClientUserIdAndUserId(UUID clientUserId, UUID userId);
}
