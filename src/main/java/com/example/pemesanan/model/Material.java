package com.example.pemesanan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name= "MATERIAL", schema="HR")
@Entity
public class Material {

	@Id
	@Column(name = "ID_MATERIAL")
	private String idMaterial;

	@Column(name = "MERK")
	private String merk;
	
	@Column(name = "COLOR")
	private String color;

	public String getIdMaterial() {
		return idMaterial;
	}

	public void setIdMaterial(String idMaterial) {
		this.idMaterial = idMaterial;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
