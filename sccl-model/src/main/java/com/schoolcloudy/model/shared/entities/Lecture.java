/*package com.schoolutils.model.shared.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.schoolutils.model.entities.Student;

@Entity
@Table(name="LECTURE")
public class Lecture {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long lectureId;
	
	@Column(name="DURATION")
	private Date lectureDuration;
	
	//@Column(name="PROFESSOR")
	//private AcademicStaff professor;
	
	@Column(name="LECTURE_DESCRIPTION")
	private StringBuilder lectureDescription;
	
	@Column(name="LECTURE_TIME")
	private Date lectureTime;
	
	@Column(name="COURSE_NAME")
	private String courseName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="STUDENTS_LECTURE", joinColumns=@JoinColumn(name="STUDENT_ID"),
	     inverseJoinColumns=@JoinColumn(name="USER_ID"))
	private List<Student> studentsForLecture;
	
	@Column(name="WEEKDAY")
	private WeekDay weekday; 
	
	
	public List<Student> getStudentsForLecture() {
		return studentsForLecture;
	}

	public void setStudentsForLecture(List<Student> studentsForLecture) {
		this.studentsForLecture = studentsForLecture;
	}

	public WeekDay getWeekday() {
		return weekday;
	}

	public void setWeekday(WeekDay weekday) {
		this.weekday = weekday;
	}

	public Lecture() {
	}

}
*/