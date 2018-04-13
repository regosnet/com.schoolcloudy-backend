package com.schoolcloudy.model.shared.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ASSIGNMENT_PARENT")
@IdClass(AssignmentParentId.class)
public class AssignmentParent {
	
	@Id
	long intId;
	
	
	String title;
	
	@Id
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="idAssignment", referencedColumnName="intId"),
		@JoinColumn(name="ASSIGNMENT_ID", referencedColumnName="extId")
	})
	private Assignment extId;
	
	

	public AssignmentParent() {
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
