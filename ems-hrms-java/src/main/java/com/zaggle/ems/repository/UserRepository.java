package com.zaggle.ems.repository;

import com.zaggle.ems.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.*;

@Repository
public interface UserRepository extends JpaRepository <User, UUID> {

}
