package com.schoolcloudy.model.shared.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;



//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) 
@MappedSuperclass
@AttributeOverrides({
	@AttributeOverride(name="startDate", column=@Column(name="HIRED_DATE", nullable=false)),
	@AttributeOverride(name="endDate", column=@Column(name="JOB_END_DATE", nullable=false)),
	@AttributeOverride(name="hobbies", column=@Column(name="STAFF_HOBBIES"))
})
public class Staff extends User{

}
