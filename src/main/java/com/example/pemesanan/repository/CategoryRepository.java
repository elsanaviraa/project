package com.example.pemesanan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pemesanan.model.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

	public Category findByIdCategory(String idCategory);
}
