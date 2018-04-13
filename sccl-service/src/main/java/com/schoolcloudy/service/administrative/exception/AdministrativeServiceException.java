package com.schoolcloudy.service.administrative.exception;

import java.io.Serializable;

public class AdministrativeServiceException extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;
	private String message;
	
	public AdministrativeServiceException() {
		this("Could get the data from the database");
	}

	public AdministrativeServiceException(String message) {
		this.message = System.currentTimeMillis() + ": "  + message;
	}

	public String getMessage() {
		return message;
	}

}
