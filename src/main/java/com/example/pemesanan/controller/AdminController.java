package com.example.pemesanan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pemesanan.model.Admin;
import com.example.pemesanan.service.AdminService;

@RestController
@RequestMapping("api/pemesanan/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping
	public List<Admin>findAll() {
		return adminService.findAll();
	}
	
	@PostMapping
	public String regAdmin(@RequestBody Admin req) {
		return adminService.regAdmin(req);
	}
	
	@PutMapping
	public String updAdmin(@RequestBody Admin req) {
		return adminService.updAdmin(req);
	}
	
	@DeleteMapping("{idAdmin}")
	public String delAdmin(@PathVariable String idAdmin) {
		return adminService.delAdmin(idAdmin);
	}
	
	
	
	

}
