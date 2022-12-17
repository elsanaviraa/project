package com.example.pemesanan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pemesanan.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
	
	public List<Product> findByIdProduct(String idProduct);
}
