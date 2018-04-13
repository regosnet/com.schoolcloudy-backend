package com.schoolcloudy.model.shared.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Identity implements Serializable{
	private static final long serialVersionUID = 1L;

	
	private Long internalId;
	
	private String externalId;

	public Long getIdUser() {
		return internalId;
	}
	
	public Identity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getInternalId() {
		return internalId;
	}

	public void setInternalId(Long internalId) {
		this.internalId = internalId;
	}
	
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}
