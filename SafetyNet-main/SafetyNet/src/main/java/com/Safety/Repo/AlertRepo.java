package com.Safety.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Safety.Model.Alerts;

public interface AlertRepo extends JpaRepository<Alerts, Integer> {
	 @Query("SELECT DISTINCT e FROM Alerts e")
	    List<Alerts> findDistinctByAlertTypeAndLocation();
}
