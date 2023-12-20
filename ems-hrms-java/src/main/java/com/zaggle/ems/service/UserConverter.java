package com.zaggle.ems.service;

import com.zaggle.ems.common.helper.GenericConverter;
import com.zaggle.ems.dto.UserDTO;
import com.zaggle.ems.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends GenericConverter<User, UserDTO> {
    public UserConverter() {
        super(User.class, UserDTO.class);
    }
}
