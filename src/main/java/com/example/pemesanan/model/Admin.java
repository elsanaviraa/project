package com.example.pemesanan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "ADMIN", schema="HR")
@Entity

public class Admin {

	@Id
	@Column (name = "ID_ADMIN")
	private String idAdmin;
	
	@Column (name = "NAME")
	private String name;
	
	@Column (name = "EMAIL")
	private String email;
	
	@Column (name = "PASSWORD")
	private String password;

	public String getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getName() {
		return name;
	}

	public void setNama(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
