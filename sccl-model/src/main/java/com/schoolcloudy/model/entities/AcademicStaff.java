package com.schoolcloudy.model.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.schoolcloudy.model.shared.entities.Staff;



@Entity
@Table(name="ACADEMIC_STAFF")
@AttributeOverrides({
	@AttributeOverride(name="internalId", column=@Column(name="idAcademicStaff")),
	@AttributeOverride(name="externalId", column=@Column(name="ACADEMIC_STAFF_ID"))
})
public class AcademicStaff extends Staff{
/*
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="SCHOOL_STAFF", 
	joinColumns={
		@JoinColumn(name="idAcademicStaff", referencedColumnName="idAcademicStaff"),
		@JoinColumn(name="ACADEMIC_STAFF_ID", referencedColumnName="ACADEMIC_STAFF_ID")
	}, 
	inverseJoinColumns={
		@JoinColumn(name="idSchool", referencedColumnName="idSchool"),
		@JoinColumn(name="SCHOOL_ID", referencedColumnName="SCHOOL_ID")
	})
	private School school;
	
	@OneToOne
	private Faculty faculty;
	
	

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
	
	*/
	public AcademicStaff(){}
}