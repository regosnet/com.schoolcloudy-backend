package com.schoolcloudy.model.shared.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) 
	using this type of inheritance would not allow overriding of column
@Table(name="USER")
*/
@MappedSuperclass
@IdClass(Identity.class)
public class User {
	
	@Id
	@TableGenerator(name="stu_dept", table="stupk", pkColumnName="stukey", pkColumnValue="stuvalue", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="stu_dept")
	private Long internalId;
	
	@Id
	private String externalId;
	
	@Column(name="FIRST_NAME", nullable=false, length=255)
	private String firstName;
	
	@Column(name="LAST_NAME", nullable=false, length=255)
	private String lastName;
	
	@Column(name="MIDDLE_NAME", length=255)
	private String middleName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;
	
	@Column(name="USER")
	private String user;
	
	@Column(name="STATUS")
	private String status;
	
	@Embedded
	private Contact contact;
	
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
	
	@Column(name="LANGUAGE")
	private String language;
	
	/*
	@ElementCollection
	private List<String> hobbies;
	*/
	public User(){
		setUser(this);
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

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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
/*
	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
*/
	public Credential getCredential() {
		return credential;
	}

	public void setCredential(Credential credential) {
		this.credential = credential;
	}

	public String getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user.getClass().getSimpleName();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	

}
