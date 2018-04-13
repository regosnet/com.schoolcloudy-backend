package com.schoolcloudy.model.shared.entities;

import java.io.Serializable;

public class AssignmentId implements Serializable{
	private static final long serialVersionUID = 1L;

	long intId;
	
	String extId;
	public AssignmentId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIntId() {
		return intId;
	}
	public void setIntId(long intId) {
		this.intId = intId;
	}
	public String getExtId() {
		return extId;
	}
	public void setExtId(String extId) {
		this.extId = extId;
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
