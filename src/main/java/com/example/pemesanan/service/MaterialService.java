package com.example.pemesanan.service;

import java.util.List;
import com.example.pemesanan.model.Material;

public interface MaterialService {

	public List<Material> findAll();
	public String regMaterial(Material req);
	public String updMaterial(Material req);
	public String delMaterial(String id);
	
	
}
