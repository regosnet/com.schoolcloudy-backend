package com.schoolcloudy.model.shared.entities;
/*
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.schoolcloudy.model.entities.Student;


@SuppressWarnings("serial")
@Entity
@Table(name="FACULTY")
@IdClass(Identity.class)
@AttributeOverrides({
	@AttributeOverride(name="internalId", column=@Column(name="idFaculty")),
	@AttributeOverride(name="externalId", column=@Column(name="FACULTY_ID"))
})
public class Faculty implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long internalId;
	
	@Id
	private String externalId;
	
	@Column(name="FACULTY_NAME")
	private String facultyName;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="SCHOOL_FACULTY", 
		joinColumns={
			@JoinColumn(name="idFaculty", referencedColumnName="idFaculty"),
			@JoinColumn(name="FACULTY_ID", referencedColumnName="FACULTY_ID")
		}, 
		inverseJoinColumns={
			@JoinColumn(name="idSchool", referencedColumnName="idSchool"),
			@JoinColumn(name="SCHOOL_ID", referencedColumnName="SCHOOL_ID")
		})
	private School school;

	@Embedded
	@AttributeOverride(name="houseNumber", column=@Column(name="BLOCK_NUMBER"))
	private Contact contact;
/*
	@OneToMany(cascade=CascadeType.ALL, mappedBy="faculty")
	private List<Student> students;
	
	@Column(name="NUMBER_OF_STUDENTS")
	private int numberOfStudents;
	
	@Column(name="NUMBER_OF_ACADEMIC_STAFF")
	private int numberOfAcademicStaff;
	
	@Column(name="NUMBER_OF_NON_ACADEMIC_STAFF")
	private int numberOfNonAcademicStaff;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="faculty")
	public Set<Programme> facultyProgrammes;
/*	
	@OneToOne
	@JoinTable(name="HEAD_OF_FACULTY", 
	joinColumns={
		@JoinColumn(name="idFaculty", referencedColumnName="idFaculty"),
		@JoinColumn(name="FACULTY_ID", referencedColumnName="FACULTY_ID")
	}, 
	inverseJoinColumns={
			@JoinColumn(name="idHeadOfFaculty", referencedColumnName="idAcademicStaff"),
			@JoinColumn(name="HEAD_OF_FACULTY_ID", referencedColumnName="ACADEMIC_STAFF_ID")
	})
	//private AcademicStaff headOfFaculty;

	public Faculty() {}

	
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		if(obj.getClass() == getClass()) {
			return false;
		}
		
		Faculty rhs = (Faculty) obj;
		return new EqualsBuilder()
				.append(facultyName, rhs.getFacultyName())
				.append(externalId, rhs.getExternalId())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(externalId)
				.append(facultyName)
				.toHashCode();
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public int getNumberOfAcademicStaff() {
		return numberOfAcademicStaff;
	}

	public void setNumberOfAcademicStaff(int numberOfAcademicStaff) {
		this.numberOfAcademicStaff = numberOfAcademicStaff;
	}

	public int getNumberOfNonAcademicStaff() {
		return numberOfNonAcademicStaff;
	}

	public void setNumberOfNonAcademicStaff(int numberOfNonAcademicStaff) {
		this.numberOfNonAcademicStaff = numberOfNonAcademicStaff;
	}
	
	public Set<Programme> getFacultyProgrammes() {
		return facultyProgrammes;
	}

	public void setFacultyProgrammes(Set<Programme> facultyProgrammes) {
		this.facultyProgrammes = facultyProgrammes;
	}

	public AcademicStaff getHeadOfFaculty() {
		return headOfFaculty;
	}
	
	public void setHeadOfFaculty(AcademicStaff headOfFaculty) {
		this.headOfFaculty = headOfFaculty;
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

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
	
	
}*/