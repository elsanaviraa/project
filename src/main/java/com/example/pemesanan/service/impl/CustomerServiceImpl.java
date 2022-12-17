package com.example.pemesanan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pemesanan.model.Customer;
import com.example.pemesanan.repository.CustomerRepository;
import com.example.pemesanan.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getCustomerByEmail (String email) {
		return customerRepository.findByEmail(email);
	}
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		
		return customerRepository.findAll();
	}
	
	@Override
	public String regCustomer(Customer req) {
		String result = "Failed to register Customer Data!";
		if(req != null) {
			customerRepository.save(req);
			result = "Succes to register Customer Data!";
		}
		return result;
	}
	
	@Override
	public String updCustomer(Customer req) {
		String result = "Failed to Update Customer Data!";
		
		Optional<Customer> optCustomer =
				customerRepository.findById(req.getIdCustomer());
		
		if(optCustomer.isPresent()) {
			customerRepository.save(req);
			result = "Succes to Update Customer Data!";
			
		}
		return result;
	} 
	@Override
	public String delCustomer(String id) {
		String result = "Failed to Delete Customer Data!";
		
		Optional<Customer> optCustomer=
				customerRepository.findById(id);
		
	if(optCustomer.isPresent()) {
		customerRepository.deleteById(id);
		result = "Succes to Delete Customer Data!";
	}
	return result;
	}
	
}
