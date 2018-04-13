package com.schoolcloudy.model.shared.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="GRADE_BOOK")
@IdClass(Identity.class)
@AttributeOverrides({
	@AttributeOverride(name="internalId", column=@Column(name="idGradeBook")),
	@AttributeOverride(name="externalId", column=@Column(name="GRADEBOOK_ID"))
})
public class GradeBook {

	@Id
	private Long internalId;
	
	@Id
	private String externalId;
	
	@Column(name="GRADE")
	private double grade;
	
	public GradeBook(){}
	
}
