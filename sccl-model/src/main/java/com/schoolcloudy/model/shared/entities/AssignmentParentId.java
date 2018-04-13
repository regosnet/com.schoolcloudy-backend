package com.schoolcloudy.model.shared.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AssignmentParentId implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5232522694790012896L;


	long intId;
	

	AssignmentId extId;


	public long getIntId() {
		return intId;
	}


	public void setIntId(long intId) {
		this.intId = intId;
	}

	

	public AssignmentId getExtId() {
		return extId;
	}


	public void setExtId(AssignmentId extId) {
		this.extId = extId;
	}


	public AssignmentParentId() {
		super();
		// TODO Auto-generated constructor stub
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
