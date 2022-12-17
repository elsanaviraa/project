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

import com.example.pemesanan.dto.ViewProductDto;
import com.example.pemesanan.model.Product;
import com.example.pemesanan.service.ProductService;

@CrossOrigin
@RestController
@RequestMapping("api/pemesanan/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<Product>findAll() {
		return productService.findAll();
	}
	
	@PostMapping("idProduct/{idProduct}")
	public List<ViewProductDto> getViewByDto (@PathVariable String idProduct){
		return productService.getViewByDto(idProduct);
	}
	
	@PostMapping
	public String regProduct(@RequestBody Product req) {
		return productService.regProduct(req);
	}
	
	@PutMapping
	public String updProduct(@RequestBody Product req) {
		return productService.updProduct(req);
	}
	
	@DeleteMapping("{idProduct}")
	public String delProduct(@PathVariable String idProduct) {
		return productService.delProduct(idProduct);
	}
	
	

}
