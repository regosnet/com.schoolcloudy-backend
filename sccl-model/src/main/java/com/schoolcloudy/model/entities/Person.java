package com.schoolcloudy.model.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.schoolcloudy.model.shared.entities.Contact;
import com.schoolcloudy.model.shared.entities.Credential;
import com.schoolcloudy.model.shared.entities.Gender;
import com.schoolcloudy.model.shared.entities.Identity;



@Entity
@Table(name="PERSON")
@IdClass(Identity.class)
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long internalId;
	
	@Id
	private String externalId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="MIDDLE_NAME", length=255)
	private String middleName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;
	
	@Enumerated(EnumType.STRING)
	@Column(name="GENDER")
	private Gender gender;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CREDENTIAL_ID")
	private Credential credential;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	@Embedded
	private Contact contact;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Credential getCredential() {
		return credential;
	}

	public void setCredential(Credential credential) {
		this.credential = credential;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Person(){}

	@Override
	public String toString() {
		return "Person [internalId=" + internalId + ", externalId=" + externalId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", middleName=" + middleName + ", dateOfBirth=" + dateOfBirth + ", gender="
				+ gender + ", credential=" + credential + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", contact=" + contact + "]";
	}

	

	
}
