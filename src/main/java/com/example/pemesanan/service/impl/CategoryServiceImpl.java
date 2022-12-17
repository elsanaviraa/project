package com.example.pemesanan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pemesanan.model.Category;
import com.example.pemesanan.repository.CategoryRepository;
import com.example.pemesanan.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		
		return categoryRepository.findAll();
	}
	
	@Override
	public String regCategory(Category req) {
		String result = "Failed to register Category Data!";
		if(req != null) {
			categoryRepository.save(req);
			result = "Succes to register Category Data!";
		}
		return result;
	}
	
	@Override
	public String updCategory (Category req) {
		String result = "Failed to Update Category Data!";
		
		Optional<Category> optCategory =
				categoryRepository.findById(req.getIdCategory());
		
		if(optCategory.isPresent()) {
			categoryRepository.save(req);
			result = "Succes to Update Category Data!";
			
		}
		return result;
	} 
	@Override
	public String delCategory(String id) {
		String result = "Failed to Delete Category Data!";
		
		Optional<Category> optCategory=
				categoryRepository.findById(id);
		
	if(optCategory.isPresent()) {
		categoryRepository.deleteById(id);
		result = "Succes to Delete Category Data!";
	}
	return result;
	}
	

}
