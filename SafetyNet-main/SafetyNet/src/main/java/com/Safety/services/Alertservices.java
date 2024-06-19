package com.Safety.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Safety.Model.Alerts;

@Service
public interface Alertservices {
Alerts saveEmployee(Alerts alerts);
	Alerts updateEmployee(int id ,Alerts alerts);
	List<Alerts> getAllEmployees();
	Alerts getEmployee(int alertid);
	void deleteEmployee(int alertid);
}
