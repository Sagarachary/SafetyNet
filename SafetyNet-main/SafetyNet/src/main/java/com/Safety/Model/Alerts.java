package com.Safety.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Alerts {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int alertId;
  public Alerts() {
		super();
		// TODO Auto-generated constructor stub
	}

@Override
	public String toString() {
		return "Alerts [alertId=" + alertId + ", alertType=" + alertType + ", alertMessage=" + alertMessage
				+ ", location=" + location + ", timestamp=" + timestamp + ", status=" + status + "]";
	}
public Alerts(int alertId, String alertType, String alertMessage, String location, String timestamp,
			String status) {
		super();
		this.alertId = alertId;
		this.alertType = alertType;
		this.alertMessage = alertMessage;
		this.location = location;
		this.timestamp = timestamp;
		this.status = status;
	}
public int getAlertId() {
		return alertId;
	}
	public void setAlertId(int alertId) {
		this.alertId = alertId;
	}
	public String getAlertType() {
		return alertType;
	}
	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}
	public String getAlertMessage() {
		return alertMessage;
	}
	public void setAlertMessage(String alertMessage) {
		this.alertMessage = alertMessage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
private String alertType;  
  private String alertMessage;
  private String location;
  private String timestamp;
  private String status;

  
  
}
