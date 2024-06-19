package com.Safety.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Safety.DTO.LoginDTO;
import com.Safety.DTO.UserDTO;
import com.Safety.Model.Alerts;
import com.Safety.Repo.AlertRepo;
import com.Safety.respoonse.LoginResponse;
import com.Safety.services.Alertservices;
import com.Safety.services.Userservices;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/Safety")
public class UserController {
	@Autowired
	private Alertservices alertservices;
@Autowired
private Userservices userservices;

	 @PostMapping(path = "/save")
	    public String saveEmployee(@RequestBody UserDTO userDTO)
	    {
	        String id = userservices.addEmployee(userDTO);
	        return id;
	    }
	 

	    @PostMapping(path = "/login")
	    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
	    {
	        LoginResponse loginResponse = userservices.loginEmployee(loginDTO);
	        return ResponseEntity.ok(loginResponse);
	    }
	    @GetMapping("/userdashboard")
	    public String index() {
	        return "Welcome to index page your now authorized";
	    }

	    @GetMapping("/home")
	    public String home() {
	        return "Welcome to home page Authentication is not requried !";
	    }
	    @GetMapping("/allalerts")
	    public List<Alerts> getallAlerts(){
	   	 return alertservices.getAllEmployees();
	    }
	    
	    
	    @PostMapping("/postalert")
	    public Alerts creatEmployee(@RequestBody Alerts alerts) {
	   	  return alertservices.saveEmployee(alerts);
	    }
	    
	    

}
