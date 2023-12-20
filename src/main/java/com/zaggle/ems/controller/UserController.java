package com.zaggle.ems.controller;

import com.zaggle.ems.common.dto.SuccessfulResponse;
import com.zaggle.ems.dto.UserRequestDTO;
import com.zaggle.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/zaggle/hrms")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "add/user")
    public ResponseEntity<?> createUser(@RequestBody UserRequestDTO newDTO) {
        SuccessfulResponse<?> savedUserDTO = userService.createUser(newDTO);
        return new ResponseEntity<>(savedUserDTO, HttpStatus.CREATED);

    }

}
