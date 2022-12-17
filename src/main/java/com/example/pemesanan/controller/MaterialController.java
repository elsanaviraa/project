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

import com.example.pemesanan.model.Material;
import com.example.pemesanan.service.MaterialService;

@CrossOrigin
@RestController
@RequestMapping("api/pemesanan/material")
public class MaterialController {

	@Autowired
	MaterialService materialService;
	
	@GetMapping
	public List<Material>findAll() {
		return materialService.findAll();
	}
	
	@PostMapping
	public String regMaterial(@RequestBody Material req) {
		return materialService.regMaterial(req);
	}
	
	@PutMapping
	public String updMaterial(@RequestBody Material req) {
		return materialService.updMaterial(req);
	}
	
	@DeleteMapping("{idMaterial}")
	public String delMaterial(@PathVariable String idMaterial) {
		return materialService.delMaterial(idMaterial);
	}
	
	
	
}
