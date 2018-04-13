package com.schoolcloudy.model.entities;
/*
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.schoolcloudy.model.shared.entities.School;
import com.schoolcloudy.model.shared.entities.Staff;



@Entity
@Table(name="NON_ACADEMIC_STAFF")
@AttributeOverrides({
	@AttributeOverride(name="internalId", column=@Column(name="idNonAcademicStaff")),
	@AttributeOverride(name="externalId", column=@Column(name="NON_ACADEMIC_STAFF_ID", nullable=false))
})
public class NonAcademicStaff extends Staff{
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="SCHOOL_STAFF", 
	joinColumns={
		@JoinColumn(name="idNonAcademicStaff", referencedColumnName="idNonAcademicStaff"),
		@JoinColumn(name="NON_ACADEMIC_STAFF_ID", referencedColumnName="NON_ACADEMIC_STAFF_ID")
	}, 
	inverseJoinColumns={
		@JoinColumn(name="idSchool", referencedColumnName="idSchool"),
		@JoinColumn(name="SCHOOL_ID", referencedColumnName="SCHOOL_ID")
	})
	private School school;
}
*/