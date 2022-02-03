package com.philiance.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="person")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="person_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Person implements Serializable {
	
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name = "id_person")
  private int idPerson;

  @Column(name = "full_name")
  private String fullName;

  @Column(name = "phone_number")
  private String phoneNumber;
  
  @Column(name = "email")
  private String email;

	public Integer getIdPerson() {
		return idPerson;
	}
	
	public void setIdPerson(Integer idPerson) {
		this.idPerson = idPerson;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

 
}
