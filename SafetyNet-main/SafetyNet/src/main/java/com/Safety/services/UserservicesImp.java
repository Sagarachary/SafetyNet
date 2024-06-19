package com.Safety.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Safety.DTO.LoginDTO;
import com.Safety.DTO.UserDTO;
import com.Safety.Model.Register;
import com.Safety.Repo.Userrepo;
import com.Safety.respoonse.LoginResponse;
@Service
public class UserservicesImp implements Userservices{

	@Autowired
	private Userrepo userrepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

	/*
	 * @Autowired private JavaMailSender mailSender;
	 */
	@Override
	public String addEmployee(UserDTO userDTO) {
		
		Register userreRegister = new Register(
				userDTO.getId(),
                userDTO.getUsername(),
                userDTO.getMobile(),
                userDTO.getEmail(),
                userDTO.getAddress(),
                userDTO.getGender(),
     
                this.passwordEncoder.encode(userDTO.getPassword())
        );
        userrepo.save(userreRegister);
        return userreRegister.getUsername();
		
	}
	@Override
	public LoginResponse loginEmployee(LoginDTO loginDTO) {

	
		 String msg = "";
	     Register   userregRegister = userrepo.findByAddress(loginDTO.getAddress());
	     System.out.println(loginDTO.getAddress());
	        if (userregRegister != null) {
	            String password = loginDTO.getGender();
	            String encodedPassword = userregRegister.getGender();
	            System.out.println(password);
	            System.out.println(encodedPassword);
	            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
	            System.out.println(isPwdRight);
	            if (isPwdRight) {
	                Optional<Register> user = userrepo.findOneByAddressAndGender(loginDTO.getAddress(), encodedPassword);
	                if (user.isPresent()) {
	                    return new LoginResponse("Login Success", true);
	                } else {
	                    return new LoginResponse("Login Failed", false);
	                }
	            } else {
	                return new LoginResponse("password Not Match", false);
	            }
	        }else {
	            return new LoginResponse("Email not exits", false);
	        }
	    }
	
	
	

}
