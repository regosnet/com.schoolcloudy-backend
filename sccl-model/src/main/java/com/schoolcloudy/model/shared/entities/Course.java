package com.schoolcloudy.model.shared.entities;
/*
import java.util.List;
import java.util.Map;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

import com.schoolcloudy.model.entities.AcademicStaff;



@Entity
@Table(name="COURSE")
@IdClass(Identity.class)
@AttributeOverrides({
	@AttributeOverride(name="internalId", column=@Column(name="idCourse", nullable=false)),
	@AttributeOverride(name="externalId", column=@Column(name="COURSE_CODE", nullable=false)),
})
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long internalId;
	
	@Id
	private String externalId;
	
	@Column(name="COURSE_TITLE")
	private String courseTitle;
	
	// provides abstract description of course
	@Column(name="COURSE_DESCRIPTION")
	private String courseDescription;
	
	// describes if course is compulsory in the limited choice of courses
	@Column(name="COURSE_STATUS")
	private String courseStatus;
	
	@Column(name="COURSE_LEVEL")
	private String courseLevel;
	
	// course type could Profession or Academic
	@Column(name="COURSE_TYPE")
	private String courseType;
	
	@ElementCollection
	@Column(name="LANGUAGE_OF_INSTRUCTION")
	private List<String> languageOfInstruction;
	
	// defines the course part, (part 1, part 2, ..)
	@ElementCollection
	@Column(name="COURSE_VOLUME")
	private List<String> volume;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@MapKeyColumn(name="ACADEMIC_RESPONSIBILITY")
	@JoinTable(name="COURSE_ACADEMIC_STAFFS", 
		joinColumns={
			@JoinColumn(name="idCourse", referencedColumnName="idCourse"),
			@JoinColumn(name="COURSE_CODE", referencedColumnName="COURSE_CODE")
		}, inverseJoinColumns={
				@JoinColumn(name="idAcademicStaff", referencedColumnName="idAcademicStaff"),
				@JoinColumn(name="ACADEMIC_STAFF_ID", referencedColumnName="ACADEMIC_STAFF_ID")
		})
	private Map<String, AcademicStaff> academicStaff;
	
	@ElementCollection
	@Column(name="GOALS_AND_OBJECTIVES")
	private List<String> goalsAndObjectives;
	
	@ElementCollection
	@Column(name="COURSE_PREREQUISITES")
	private List<String> prerequisites;
	
	@ElementCollection
	@MapKeyColumn(name="OUTCOME")
	@Column(name="ASSESMENT")
	private Map<String, String> outcomeAndAssesment;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name="PROGRAMME_COURSES", 
	joinColumns={
		@JoinColumn(name="idCourse", referencedColumnName="idCourse"),
		@JoinColumn(name="COURSE_CODE", referencedColumnName="COURSE_CODE")
	},
	inverseJoinColumns={
		@JoinColumn(name="idProgramme", referencedColumnName="idProgramme"),
		@JoinColumn(name="PROGRAMME_ID", referencedColumnName="PROGRAMME_ID")
	}
		)
	private Programme programme;
	
	public Course(){}

	
}
*/