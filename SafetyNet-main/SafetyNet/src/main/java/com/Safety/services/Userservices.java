package com.Safety.services;

import org.springframework.stereotype.Service;

import com.Safety.DTO.LoginDTO;
import com.Safety.DTO.UserDTO;

@Service
public interface Userservices {

	String addEmployee(UserDTO userDTO);

	com.Safety.respoonse.LoginResponse loginEmployee(LoginDTO loginDTO);

}
