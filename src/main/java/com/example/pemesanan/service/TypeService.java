package com.example.pemesanan.service;

import java.util.List;

import com.example.pemesanan.model.Type;

public interface TypeService {
	
	public List<Type> findAll();
	public String regType(Type req);
	public String updType(Type req);
	public String delType(String id);
}
