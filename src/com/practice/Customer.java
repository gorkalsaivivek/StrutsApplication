package com.practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Customer")
public class Customer {
	//@Id
	//@Column(name="CustomerId") 
	//@GeneratedValue
	//(strategy=GenerationType.IDENTITY)
	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name="CustomerId", unique = true, nullable = false, precision = 15, scale = 0)
	private int customerId;
	@Column(name="EmailId")
	private String emailId;
	@Column(name="UserName")
	private String userName;
	@Column(name="Password")
	private String password;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
