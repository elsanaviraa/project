package com.example.pemesanan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pemesanan.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {

}
