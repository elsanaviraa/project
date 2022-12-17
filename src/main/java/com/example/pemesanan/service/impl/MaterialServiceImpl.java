package com.example.pemesanan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pemesanan.model.Material;
import com.example.pemesanan.repository.MaterialRepository;
import com.example.pemesanan.service.MaterialService;

@Service
public class MaterialServiceImpl implements MaterialService {
	
	@Autowired
	MaterialRepository materialRepository;
	
	@Override
	public List<Material> findAll() {
		// TODO Auto-generated method stub
		
		return materialRepository.findAll();
	}
	
	@Override
	public String regMaterial(Material req) {
		String result = "Failed to register Material Data!";
		if(req != null) {
			materialRepository.save(req);
			result = "Succes to register Material Data!";
		}
		return result;
	}
	
	@Override
	public String updMaterial (Material req) {
		String result = "Failed to Update Material Data!";
		
		Optional<Material> optMaterial =
				materialRepository.findById(req.getIdMaterial());
		
		if(optMaterial.isPresent()) {
			materialRepository.save(req);
			result = "Succes to Update Material Data!";
			
		}
		return result;
	} 
	@Override
	public String delMaterial(String id) {
		String result = "Failed to Delete Material Data!";
		
		Optional<Material> optMaterial=
				materialRepository.findById(id);
		
	if(optMaterial.isPresent()) {
		materialRepository.deleteById(id);
		result = "Succes to Delete Material Data!";
	}
	return result;
	}
	

}
