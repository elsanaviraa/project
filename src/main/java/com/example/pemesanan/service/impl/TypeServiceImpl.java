package com.example.pemesanan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pemesanan.model.Type;
import com.example.pemesanan.repository.TypeRepository;
import com.example.pemesanan.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	TypeRepository typeRepository;
	
	@Override
	public List<Type> findAll() {
		// TODO Auto-generated method stub
		
		return typeRepository.findAll();
	}
	
	@Override
	public String regType(Type req) {
		String result = "Failed to register Type Data!";
		if(req != null) {
			typeRepository.save(req);
			result = "Succes to register Type Data!";
		}
		return result;
	}
	
	@Override
	public String updType (Type req) {
		String result = "Failed to Update Type Data!";
		
		Optional<Type> optType =
				typeRepository.findById(req.getIdType());
		
		if(optType.isPresent()) {
			typeRepository.save(req);
			result = "Succes to Update Type Data!";
			
		}
		return result;
	} 
	@Override
	public String delType(String id) {
		String result = "Failed to Delete Type Data!";
		
		Optional<Type> optType=
				typeRepository.findById(id);
		
	if(optType.isPresent()) {
		typeRepository.deleteById(id);
		result = "Succes to Delete Type Data!";
	}
	return result;
	}
	
}
