package com.example.dealbpm.models;

/**
 * This class was automatically generated by the data modeler tool.
 */


public class DealDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long id;

	private java.lang.String dealName;

	private java.lang.String amount;

	private java.util.Date dealDate;

	private java.lang.String customerName;

	private java.lang.String addressLine1;

	private java.lang.String addressLine2;

	private java.lang.String state;

	private java.lang.String country;

	private java.lang.Integer zipcode;

	private java.lang.String email;

	public DealDetails() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getDealName() {
		return this.dealName;
	}

	public void setDealName(java.lang.String dealName) {
		this.dealName = dealName;
	}

	public java.lang.String getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.String amount) {
		this.amount = amount;
	}

	public java.util.Date getDealDate() {
		return this.dealDate;
	}

	public void setDealDate(java.util.Date dealDate) {
		this.dealDate = dealDate;
	}

	public java.lang.String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(java.lang.String customerName) {
		this.customerName = customerName;
	}

	public java.lang.String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(java.lang.String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public java.lang.String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(java.lang.String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getCountry() {
		return this.country;
	}

	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	public java.lang.Integer getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(java.lang.Integer zipcode) {
		this.zipcode = zipcode;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public DealDetails(java.lang.Long id, java.lang.String dealName,
			java.lang.String amount, java.util.Date dealDate,
			java.lang.String customerName, java.lang.String addressLine1,
			java.lang.String addressLine2, java.lang.String state,
			java.lang.String country, java.lang.Integer zipcode,
			java.lang.String email) {
		this.id = id;
		this.dealName = dealName;
		this.amount = amount;
		this.dealDate = dealDate;
		this.customerName = customerName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.email = email;
	}

	@Override
	public String toString() {
		return "DealDetails [id=" + id + ", dealName=" + dealName + ", amount=" + amount + ", dealDate=" + dealDate
				+ ", customerName=" + customerName + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + ", email=" + email + "]";
	}
	
	
}