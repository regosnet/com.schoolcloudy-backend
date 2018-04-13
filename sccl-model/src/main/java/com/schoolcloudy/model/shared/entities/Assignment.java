package com.schoolcloudy.model.shared.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="ASSIGNMENT")
@IdClass(AssignmentId.class)
public class Assignment extends Examination implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name="stu_dept", table="stupk", pkColumnName="stukey", pkColumnValue="stuvalue", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="stu_dept")
	long intId;
	
	@Id
	String extId;
	
	@OneToMany
	private List<AssignmentParent> parent;
	
	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public long getIntId() {
		return intId;
	}
	public void setIntId(long intId) {
		this.intId = intId;
	}
	public String getExtId() {
		return extId;
	}
	public void setExtId(String extId) {
		this.extId = extId;
	}
	public List<AssignmentParent> getParent() {
		return parent;
	}
	public void setParent(List<AssignmentParent> parent) {
		this.parent = parent;
	}
	
	public String setExtIdForUSer() {
		return "AS4875";
	}
	
}
