package com.zaggle.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequestDTO {
    private UserDTO userDTO;
    private ClientUserDTO clientUserDTO;
}
