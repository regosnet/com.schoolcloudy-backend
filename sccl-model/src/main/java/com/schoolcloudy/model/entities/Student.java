package com.schoolcloudy.model.entities;

import java.io.Serializable;
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

import com.schoolcloudy.model.shared.entities.User;




@SuppressWarnings("serial")
@Entity
@Table(name="STUDENT")
@AttributeOverrides({
	@AttributeOverride(name="internalId", column=@Column(name="idStudent")),
	@AttributeOverride(name="externalId", column=@Column(name="STUDENT_ID", nullable=false)),
	@AttributeOverride(name="startDate", column=@Column(name="ENROLLMENT_DATE", nullable=false)),
	@AttributeOverride(name="endDate", column=@Column(name="GRADUATION_DATE")),
	@AttributeOverride(name="hobbies", column=@Column(name="STUDENT_HOBBIES"))
})
public class Student extends User implements Serializable{
/*
	@ManyToMany
	@JoinTable(name="STUDENT_PARENT", 
		joinColumns= {
				@JoinColumn(name="idStudent", referencedColumnName="idStudent"),
				@JoinColumn(name="STUDENT_ID", referencedColumnName="STUDENT_ID")
		},
		inverseJoinColumns={
				@JoinColumn(name="idParent", referencedColumnName="idParent"),
				@JoinColumn(name="PARENT_ID", referencedColumnName="PARENT_ID")
		}
			)
	private List<Parent> studentParent;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="STUDENT_FACULTY",
			joinColumns ={
					@JoinColumn(name="idStudent", referencedColumnName="idStudent"),
					@JoinColumn(name="STUDENT_ID", referencedColumnName="STUDENT_ID")
	},
			inverseJoinColumns={
					@JoinColumn(name="idFaculty", referencedColumnName="idFaculty"),
					@JoinColumn(name="FACULTY_ID", referencedColumnName="FACULTY_ID")	
			}
	)
	private Faculty faculty;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="ALL_STUDENTS_OF_SCHOOL",
			joinColumns ={
					@JoinColumn(name="idStudent", referencedColumnName="idStudent"),
					@JoinColumn(name="STUDENT_ID", referencedColumnName="STUDENT_ID")
	},
			inverseJoinColumns={
					@JoinColumn(name="idSchool", referencedColumnName="idSchool"),
					@JoinColumn(name="SCHOOL_ID", referencedColumnName="SCHOOL_ID")	
			}
	)
	private School school;
	*/
	
	public Student() {}
	/*
	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public List<Parent> getStudentParent() {
		return studentParent;
	}
	
	public void setStudentParent(List<Parent> studentParent) {
		this.studentParent = studentParent;
	}
*/

	@Override
	public String toString() {
		return "Student [getInternalId()=" + getInternalId() + ", getExternalId()=" + getExternalId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getMiddleName()="
				+ getMiddleName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getContact()=" + getContact()
				+ ", getGender()=" + getGender() + ", getStartDate()=" + getStartDate() + ", getEndDate()="
				+ getEndDate() + ", getCredential()=" + getCredential() + ", getUser()=" + getUser() + ", getStatus()="
				+ getStatus() + ", getLanguage()=" + getLanguage() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
