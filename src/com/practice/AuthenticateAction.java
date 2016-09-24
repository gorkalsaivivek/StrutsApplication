package com.practice;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AuthenticateAction extends ActionSupport implements ModelDriven 
{
	
	CustomerDAO dao = new CustomerDAO();
	Customer customer  = new Customer();
	
	
	private String emailId;
	private String password;
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute()
	{
		System.out.println(getEmailId());
		System.out.println(getPassword());
	if(dao.checkCustomer(customer)==1)
	{
	return "success";
	}
	
	else
	{
		return "failure";
	}

	
	}
	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
}
