package com.example.pemesanan.service;

import java.util.List;
import com.example.pemesanan.model.Payment;

public interface PaymentService {

	public List<Payment> findAll();
	public String regPayment(Payment req);
	public String updPayment(Payment req);
	public String delPayment(String id);
}
