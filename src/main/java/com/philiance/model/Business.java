package com.philiance.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value ="Business")
public class Business extends Person {

	  @Column(name = "financial_first_name")
	  private String financialFirstName;

	  @Column(name = "financial_last_name")
	  private String financialLastName;
	  
	  @Column(name = "financial_phone")
	  private String financialPhone;

	public Business() {
	
	}

	@Override
	public String toString() {
		return "Business [financialFirstName=" + financialFirstName + "]";
	}

	public String getFinancialFirstName() {
		return financialFirstName;
	}

	public void setFinancialFirstName(String financialFirstName) {
		this.financialFirstName = financialFirstName;
	}

	public String getFinancialLastName() {
		return financialLastName;
	}

	public void setFinancialLastName(String financialLastName) {
		this.financialLastName = financialLastName;
	}

	public String getFinancialPhone() {
		return financialPhone;
	}

	public void setFinancialPhone(String financialPhone) {
		this.financialPhone = financialPhone;
	}
	
	
	  
}
