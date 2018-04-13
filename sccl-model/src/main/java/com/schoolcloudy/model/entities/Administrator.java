package com.schoolcloudy.model.entities;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.schoolcloudy.model.shared.entities.Staff;



@Entity
@Table(name="ADMINISTRATOR")
@AttributeOverrides({
	@AttributeOverride(name="internalId", column=@Column(name="idAdministrator")),
	@AttributeOverride(name="externalId", column=@Column(name="ADMINISTRATOR_ID", nullable=false))
})
public class Administrator extends Staff implements Serializable{
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Administrator [getInternalId()=" + getInternalId() + ", getExternalId()=" + getExternalId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getMiddleName()="
				+ getMiddleName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getContact()=" + getContact().getHouseNumber()
				+ ", getGender()=" + getGender() + ", getStartDate()=" + getStartDate() + ", getEndDate()="
				+ getEndDate() + ", getCredential()=" + getCredential() + "]";
	}
	
	
	
}
