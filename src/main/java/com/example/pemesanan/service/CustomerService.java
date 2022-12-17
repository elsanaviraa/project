package com.example.pemesanan.service;

import java.util.List;
import com.example.pemesanan.model.Customer;

public interface CustomerService {

	public List<Customer> findAll();
	public String regCustomer(Customer req);
	public String updCustomer(Customer req);
	public String delCustomer(String id);
	
	public List<Customer> getCustomerByEmail (String email);
}
