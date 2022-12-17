package com.example.pemesanan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "PRODUCT", schema = "HR")
@Entity
public class Product {
	
	@Id
	@Column (name = "ID_PRODUCT")
	private String idProduct;
	
	@Column (name = "PRODUCT_NAME")
	private String productName;
	
	@Column (name = "ID_CATEGORY")
	private String idCategory;
	
	@Column (name = "ID_MATERIAL")
	private String idMaterial;
	
	@Column (name = "ID_TYPE")
	private String idTipe;
	
	@Column (name = "PRICE")
	private Integer price;

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(String idCategory) {
		this.idCategory = idCategory;
	}

	public String getIdMaterial() {
		return idMaterial;
	}

	public void setIdMaterial(String idMaterial) {
		this.idMaterial = idMaterial;
	}

	public String getIdTipe() {
		return idTipe;
	}

	public void setIdTipe(String idTipe) {
		this.idTipe = idTipe;
	}
	
}
