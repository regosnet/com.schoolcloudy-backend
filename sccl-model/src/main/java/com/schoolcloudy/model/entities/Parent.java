package com.schoolcloudy.model.entities;
/*
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.schoolcloudy.model.shared.entities.School;
import com.schoolcloudy.model.shared.entities.User;


@Entity
@Table(name="PARENT_GUARDIAN")
@AttributeOverrides({
	@AttributeOverride(name="internalId", column=@Column(name="idParent", nullable=false)),
	@AttributeOverride(name="externalId", column=@Column(name="PARENT_ID", nullable=false)),
	@AttributeOverride(name="startDate", column=@Column(name="JOINED_DATE", nullable=false)),
	@AttributeOverride(name="hobbies", column=@Column(name="PARENT_HOBBIES"))
})
public class Parent extends User{
/*	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="studentParent")
	@Column(name="CHILD")
	private List<Student> child;
*//*	
	public Parent(){}
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="STUDENT_PARENTS_AND_GUARDIAN", 
		joinColumns={
			@JoinColumn(name="idPARENT"),
			@JoinColumn(name="PARENT_ID")
		}, 
		inverseJoinColumns={
			@JoinColumn(name="idSchool", referencedColumnName="idSchool"),
			@JoinColumn(name="SCHOOL_ID", referencedColumnName="SCHOOL_ID")
		})
	private School school;
/*	
	public List<Student> getChild() {
		return child;
	}

	public void setChild(List<Student> child) {
		this.child = child;
	}
*//*
	@Override
	public Date getEndDate() {
		// TODO Auto-generated method stub
		return super.getEndDate();
	}

	@Transient
	@Override
	public void setEndDate(Date endDate) {
		// TODO Auto-generated method stub
		super.setEndDate(endDate);
	}
	
}
*/