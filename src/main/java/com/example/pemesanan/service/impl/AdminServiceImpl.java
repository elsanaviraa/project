package com.example.pemesanan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pemesanan.model.Admin;
import com.example.pemesanan.repository.AdminRepository;
import com.example.pemesanan.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		
		return adminRepository.findAll();
	}
	
	@Override
	public String regAdmin(Admin req) {
		String result = "Failed to register Admin Data!";
		if(req != null) {
			adminRepository.save(req);
			result = "Succes to register Admin Data!";
		}
		return result;
	}
	
	@Override
	public String updAdmin (Admin req) {
		String result = "Failed to Update Admin Data!";
		
		Optional<Admin> optAdmin =
				adminRepository.findById(req.getIdAdmin());
		
		if(optAdmin.isPresent()) {
			adminRepository.save(req);
			result = "Succes to Update Admin Data!";
			
		}
		return result;
	} 
	@Override
	public String delAdmin(String id) {
		String result = "Failed to Delete Admin Data!";
		
		Optional<Admin> optAdmin=
				adminRepository.findById(id);
		
	if(optAdmin.isPresent()) {
		adminRepository.deleteById(id);
		result = "Succes to Delete Admin Data!";
	}
	return result;
	}
	
}
