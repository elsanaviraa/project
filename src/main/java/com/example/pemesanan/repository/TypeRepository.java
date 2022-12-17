package com.example.pemesanan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pemesanan.model.Type;

public interface TypeRepository extends JpaRepository<Type, String> {
	public Type findByIdType (String idType);

}
