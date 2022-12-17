package com.example.pemesanan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pemesanan.model.Customer;
import com.example.pemesanan.service.CustomerService;

@CrossOrigin
@RestController
@RequestMapping("api/pemesanan/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping
	public List<Customer>findAll() {
		return customerService.findAll();
	}
	
	@PostMapping
	public String regCostumer(@RequestBody Customer req) {
		return customerService.regCustomer(req);
	}
	
	@PutMapping
	public String updCostumer(@RequestBody Customer req) {
		return customerService.updCustomer(req);
	}
	
	@DeleteMapping("{idCustomer}")
	public String delCustomer(@PathVariable String idCustomer) {
		return customerService.delCustomer(idCustomer);
	}
	
	@PostMapping(value="{email}")
	public List<Customer> getCustomerByemail(@PathVariable String email){
		return customerService.getCustomerByEmail(email);
	}
	
	
	
}
