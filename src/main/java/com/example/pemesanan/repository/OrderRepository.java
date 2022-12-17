package com.example.pemesanan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pemesanan.model.Order;

public interface OrderRepository extends JpaRepository<Order, String> {

}
