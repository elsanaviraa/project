package com.example.pemesanan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pemesanan.model.Material;

public interface MaterialRepository extends JpaRepository<Material, String> {

	public Material findByIdMaterial(String idMaterial);
}
