package com.example.pemesanan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pemesanan.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{
	public List<Customer> findByEmail(String email);

}
