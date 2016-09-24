package com.practice;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddCustomerAction extends ActionSupport 
implements ModelDriven<Customer>{

Customer customer  = new Customer();
List<Customer> customers = new ArrayList<Customer>();
CustomerDAO dao = new CustomerDAO();



@Override
public Customer getModel() {
return customer;
}

public String execute()
{
dao.addCustomer(customer);
return "success";
}

public String listStudents()
{
	customers = dao.getCustomers();
return "success";
}

public Customer getStudent() {
return customer;
}

public void setStudent(Customer customer) {
this.customer = customer;
}

public List<Customer> getCustomers() {
return customers;
}

public void setStudents(List<Customer> customers) {
this.customers = customers;
}

}
