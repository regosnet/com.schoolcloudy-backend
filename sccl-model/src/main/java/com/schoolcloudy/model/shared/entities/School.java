package com.schoolcloudy.model.shared.entities;
/*
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.schoolcloudy.model.entities.NonAcademicStaff;
import com.schoolcloudy.model.entities.Parent;
import com.schoolcloudy.model.entities.Student;


@Entity
@Table(name="SCHOOL")
@IdClass(Identity.class)
@AttributeOverrides({
	@AttributeOverride(name="internalId", column=@Column(name="idSchool")),
	@AttributeOverride(name="externalId", column=@Column(name="SCHOOL_ID"))
})
public class School {

	@Id
	@TableGenerator(name="idSchool_generator", table="schoolpk", 
		pkColumnName="schoolkey", pkColumnValue="schoolvalue", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="idSchool_generator")
	private Long internalId;
	
	@Id
	private String externalId;
	
	@Column(name="SCHOOL_NAME")
	private String schoolName;
	
	@Column(name="DATE_FOUNDED")
	@Temporal(TemporalType.DATE)
	private Date dateFounded;
	
	@Column(name="SCHOOL_FOUNDER")
	private String founder;

	@OneToOne
	private AcademicStaff headOfSchool;
	
	@Embedded
	private Contact contact;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="school")
	private Set<Faculty> schoolFaculties;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="school")
	private Set<AcademicStaff> academicStaff;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="school")
	private Set<NonAcademicStaff> nonAcademicStaff;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="school")
	private Set<Parent> parentGuardian;
	

	@OneToMany(cascade=CascadeType.ALL, mappedBy="school")
	private Set<Student> students;
	
	public School() {}

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

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public Date getDateFounded() {
		return dateFounded;
	}

	public void setDateFounded(Date dateFounded) {
		this.dateFounded = dateFounded;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public AcademicStaff getHeadOfSchool() {
		return headOfSchool;
	}

	public void setHeadOfSchool(AcademicStaff headOfSchool) {
		this.headOfSchool = headOfSchool;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContactInfo(Contact contact) {
		this.contact = contact;
	}

	public Set<Faculty> getSchoolFaculties() {
		return schoolFaculties;
	}

	public void setSchoolFaculties(Set<Faculty> schoolFaculties) {
		this.schoolFaculties = schoolFaculties;
	}

	public Set<AcademicStaff> getAcademicStaff() {
		return academicStaff;
	}

	public void setAcademicStaff(Set<AcademicStaff> academicStaff) {
		this.academicStaff = academicStaff;
	}

	public Set<NonAcademicStaff> getNonAcademicStaff() {
		return nonAcademicStaff;
	}

	public void setNonAcademicStaff(Set<NonAcademicStaff> nonAcademicStaff) {
		this.nonAcademicStaff = nonAcademicStaff;
	}

	public Set<Parent> getParentGuardian() {
		return parentGuardian;
	}

	public void setParentGuardian(Set<Parent> parentGuardian) {
		this.parentGuardian = parentGuardian;
	}

	
}
*/