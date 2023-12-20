package com.zaggle.ems.service;

import com.zaggle.ems.common.dto.SuccessfulResponse;
import com.zaggle.ems.common.helper.CommonMethods;
import com.zaggle.ems.dto.UserRequestDTO;
import com.zaggle.ems.dto.UserDTO;
import com.zaggle.ems.entity.User;
import com.zaggle.ems.exception.UserServiceBusinessException;
import com.zaggle.ems.repository.EmployeeUserRepository;
import com.zaggle.ems.repository.UserRepository;
import com.zaggle.ems.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CommonMethods commonMethods;
    @Autowired
    private EmployeeUserRepository employeeUserRepository;

    @Autowired
    private UserConverter userConverter;

    public SuccessfulResponse<?> createUser(UserRequestDTO userRequestDTO){
        Optional<?> existingEmployeeUser=employeeUserRepository.findByClientUserIdAndUserId(userRequestDTO.getClientUserDTO().getClientId(), userRequestDTO.getUserDTO().getId());
      if(existingEmployeeUser.isEmpty()){
          User user=userConverter.convertToEntity(userRequestDTO.getUserDTO());
          user=userRepository.save(user);
          UserDTO resultDTO=userConverter.convertToDTO(user);
          return commonMethods.createSuccessResponse(Collections.singletonList(resultDTO));
      }
      else {
          throw new UserServiceBusinessException(Constant.USER_ALREADY_EXIST);
      }

    }
}
