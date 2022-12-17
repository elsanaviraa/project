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

import com.example.pemesanan.model.Type;
import com.example.pemesanan.service.TypeService;

@CrossOrigin
@RestController
@RequestMapping("api/pemesanan/type")
public class TypeController {
		
	@Autowired
	TypeService typeService;
	
	@GetMapping
	public List<Type>findAll() {
		return typeService.findAll();
	}
	
	@PostMapping
	public String regtype(@RequestBody Type  req) {
		return typeService.regType(req);
	}
	
	@PutMapping
	public String updtype(@RequestBody Type req) {
		return typeService.updType(req);
	}
	
	@DeleteMapping("{idType}")
	public String delType(@PathVariable String idType) {
		return typeService.delType(idType);
	}
	
	
	
}
