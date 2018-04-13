package com.schoolcloudy.model.shared.entities;
/*
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name="PROGRAMME")
@IdClass(Identity.class)
@AttributeOverrides({
	@AttributeOverride(name="internalId", column=@Column(name="idProgramme", nullable=false)),
	@AttributeOverride(name="externalId", column=@Column(name="PROGRAMME_ID", nullable=false)),
})
public class Programme {
	
	@Id
	private Long internalId;
	
	@Id
	private String externalId;
	
	@Column(name="PROGRAMME_NAME")
	private String programmeName;
	
	@Column(name="CREATED_DATE")
	private Date createDate;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="FACULTY_PROGRAMMES", 
	joinColumns={
		@JoinColumn(name="idProgramme", referencedColumnName="idProgramme"),
		@JoinColumn(name="PROGRAMME_ID", referencedColumnName="PROGRAMME_ID")
	},
	inverseJoinColumns={
			@JoinColumn(name="idFaculty", referencedColumnName="idFaculty"),
			@JoinColumn(name="FACULTY_ID", referencedColumnName="FACULTY_ID")
	})
	private Faculty faculty;
	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="programme")
	private List<Course> programmeContent;
	
	@Column(name="PROGRAMME_DURATION")
	private String programmeDuration;
	
	@Column(name="ACADEMIC_VOLUME")
	private String academicVolume;
	
	@Column(name="DEGREE_AWARDED")
	private String degreeAwarded;
	
	public Programme() {}

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

	public String getProgrammeName() {
		return programmeName;
	}

	public void setProgrammeName(String programmeName) {
		this.programmeName = programmeName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public List<Course> getProgrammeContent() {
		return programmeContent;
	}

	public void setProgrammeContent(List<Course> programmeContent) {
		this.programmeContent = programmeContent;
	}

	public String getProgrammeDuration() {
		return programmeDuration;
	}

	public void setProgrammeDuration(String programmeDuration) {
		this.programmeDuration = programmeDuration;
	}

	public String getAcademicVolume() {
		return academicVolume;
	}

	public void setAcademicVolume(String academicVolume) {
		this.academicVolume = academicVolume;
	}

	public String getDegreeAwarded() {
		return degreeAwarded;
	}

	public void setDegreeAwarded(String degreeAwarded) {
		this.degreeAwarded = degreeAwarded;
	}

	// Override HashCode and Equals methods
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		if(obj.getClass() != getClass()){
			return false;
		}
		
		Programme rhs = (Programme) obj;
		return new EqualsBuilder()
				.append(programmeName, rhs.getProgrammeName())
				.append(externalId, rhs.getExternalId())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(programmeName)
				.append(externalId)
				.hashCode();
	}
}
*/