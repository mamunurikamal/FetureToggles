package com.org.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.org.data.Address;
import com.org.data.Customer;


@Controller("customerBean")
@Scope("session")
public class ViewCustomersManagedBean {
    private List<Customer> customers;

    public ViewCustomersManagedBean() {
	customers = new ArrayList<Customer>();
	populateCustomerList();
    }

    // @PostConstruct
    public void populateCustomerList() {
	Customer cust = new Customer();
	cust.setId("1");
	cust.setFirstName("kamal");
	cust.setLastName("Mamunuri");
	Address addr = new Address();
	addr.setStreet("Vittoria Loop");
	addr.setCity("Dublin");
	addr.setState("CA");
	addr.setZipCode("94568");
	cust.setAddress(addr);
	customers.add(cust);

	cust = new Customer();
	cust.setId("2");
	cust.setFirstName("Rahul");
	cust.setLastName("Dravid");
	addr = new Address();
	addr.setStreet("Owens Dr");
	addr.setCity("Pleasanton");
	addr.setState("CA");
	addr.setZipCode("94588");
	cust.setAddress(addr);
	customers.add(cust);

	cust = new Customer();
	cust.setId("3");
	cust.setFirstName("Sachin");
	cust.setLastName("Tendulkar");
	addr = new Address();
	addr.setStreet("1201 FootHill Rd");
	addr.setCity("Mumbai");
	addr.setState("MH");
	addr.setZipCode("11111");
	cust.setAddress(addr);
	customers.add(cust);
    }

    public List<Customer> getCustomers() {
	return customers;
    }

    public void setCustomers(List<Customer> customers) {
	this.customers = customers;
    }
}
