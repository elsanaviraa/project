package com.example.pemesanan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name = "CATEGORY", schema = "HR")
@Entity
public class Category {
 
	@Id
	@Column(name= "ID_CATEGORY")
	private String idCategory;
	
	@Column(name= "NAME_CATEGORY")
	private String nameCategory;

	public String getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(String idCategory) {
		this.idCategory = idCategory;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	
	
}

