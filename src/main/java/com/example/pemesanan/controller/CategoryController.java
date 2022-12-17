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

import com.example.pemesanan.model.Category;
import com.example.pemesanan.service.CategoryService;

@CrossOrigin
@RestController
@RequestMapping("api/pemesanan/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping
	public List<Category>findAll() {
		return categoryService.findAll();
	}
	
	@PostMapping
	public String regCategory(@RequestBody Category req) {
		return categoryService.regCategory(req);
	}
	
	@PutMapping
	public String updCategory(@RequestBody Category req) {
		return categoryService.updCategory(req);
	}
	
	@DeleteMapping("{idCategory}")
	public String delCategory(@PathVariable String idCategory) {
		return categoryService.delCategory(idCategory);
	}
	
	
	
	

}
