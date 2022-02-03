package com.philiance.model;

import com.philiance.model.Person;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Particulier")
public class Particulier extends Person {

	  @Column(name = "birthdate")
	  private int birthdate;

	  @Column(name = "first_name")
	  private String firstName;

	  @Column(name = "last_name")
	  private String lastName;
	  
	  @Column(name = "place_date")
	  private Date placeDate;

	public int getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(int i) {
		this.birthdate = i;
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

	public Date getPlaceDate() {
		return placeDate;
	}

	public void setPlaceDate(Date placeDate) {
		this.placeDate = new Date();
	}


}
