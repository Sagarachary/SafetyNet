package com.Safety.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Safety.Model.Alerts;
import com.Safety.Repo.AlertRepo;

@Service
public class AlertservicesImpl implements Alertservices {
@Autowired
private AlertRepo alertRepo;
	@Override
	public Alerts saveEmployee(Alerts alerts) {
		// TODO Auto-generated method stub
		
		return alertRepo.save(alerts);
	}

	@Override
	public Alerts updateEmployee(int id, Alerts alerts) {
		// TODO Auto-generated method stub
		return alertRepo.saveAndFlush(alerts);
	}

	@Override
	public List<Alerts> getAllEmployees() {
	return	alertRepo.findDistinctByAlertTypeAndLocation();
	}

	@Override
	public Alerts getEmployee(int alertid) {
		// TODO Auto-generated method stub
		   Optional<Alerts> employeeOptional = alertRepo.findById(alertid);
	        if (employeeOptional.isPresent()) {
	            return employeeOptional.get();
	        } else {
	            throw new com.Safety.exception.ResourceNotFoundException("Employee not found with id: " + alertid);
	        }
	}

	@Override
	public void deleteEmployee(int alertid) {
		// TODO Auto-generated method stub   
		if (!alertRepo.existsById(alertid)) {
        throw new com.Safety.exception.ResourceNotFoundException("Employee not found with id to delete: " + alertid);
    }
    alertRepo.deleteById(alertid);

	}
	

}
