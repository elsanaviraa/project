package com.example.pemesanan.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pemesanan.dto.ViewProductDto;
import com.example.pemesanan.model.Category;
import com.example.pemesanan.model.Material;
import com.example.pemesanan.model.Product;
import com.example.pemesanan.model.Type;
import com.example.pemesanan.repository.CategoryRepository;
import com.example.pemesanan.repository.MaterialRepository;
import com.example.pemesanan.repository.ProductRepository;
import com.example.pemesanan.repository.TypeRepository;
import com.example.pemesanan.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	TypeRepository typeRepository;
	
	@Autowired
	MaterialRepository materialRepository;
		
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		
		return productRepository.findAll();
	}
	
	@Override
	public String regProduct(Product req) {
		String result = "Failed to register Product Data!";
		if(req != null) {
			productRepository.save(req);
			result = "Succes to register Prodct Data!";
		}
		return result;
	}
	
	@Override
	public String updProduct (Product req) {
		String result = "Failed to Update Product Data!";
		
		Optional<Product> optProduct =
				productRepository.findById(req.getIdProduct());
		
		if(optProduct.isPresent()) {
			productRepository.save(req);
			result = "Succes to UpdateProduct Data!";
			
		}
		return result;
	} 
	@Override
	public String delProduct(String id) {
		String result = "Failed to Delete Product Data!";
		
		Optional<Product> optProduct=
				productRepository.findById(id);
		
	if(optProduct.isPresent()) {
		productRepository.deleteById(id);
		result = "Succes to Delete Product Data!";
	}
	return result;
	}
	
	@Override
	public List<ViewProductDto> getViewByDto (String idProduct){
		
		List<ViewProductDto> viewProductDto = new ArrayList<>();
		List<Product> view = productRepository.findByIdProduct(idProduct);
		
		for (Product viewLoop : view) {
			ViewProductDto temp = new ViewProductDto();
		
			Category nama = categoryRepository
					.findByIdCategory(viewLoop.getIdCategory());
			
			Material nama1 = materialRepository
					.findByIdMaterial(viewLoop.getIdMaterial());
			
			Type nama2 = typeRepository
					.findByIdType(viewLoop.getIdTipe());
			
			temp.setNameCategory(nama.getNameCategory());
			temp.setNameMaterial(nama1.getMerk());
			temp.setNameType(nama2.getTypeName());
			temp.setPrice(viewLoop.getPrice());
			viewProductDto.add(temp);
			
		}
		return viewProductDto;
	}
	
	@Override
	public List<Product> getProductByIdProduct(String idProduct){
		return null;
	}
}
