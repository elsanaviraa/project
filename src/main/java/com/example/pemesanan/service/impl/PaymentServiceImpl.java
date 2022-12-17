package com.example.pemesanan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pemesanan.model.Payment;
import com.example.pemesanan.repository.PaymentRepository;
import com.example.pemesanan.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository paymentRepository;
	
	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		
		return paymentRepository.findAll();
	}
	
	@Override
	public String regPayment(Payment req) {
		String result = "Failed to register Payment Data!";
		if(req != null) {
			paymentRepository.save(req);
			result = "Succes to register Payment Data!";
		}
		return result;
	}
	
	@Override
	public String updPayment (Payment req) {
		String result = "Failed to Update Payment Data!";
		
		Optional<Payment> optPayment =
				paymentRepository.findById(req.getIdPayment());
		
		if(optPayment.isPresent()) {
			paymentRepository.save(req);
			result = "Succes to Update Payment Data!";
			
		}
		return result;
	} 
	@Override
	public String delPayment(String id) {
		String result = "Failed to Delete Payment Data!";
		
		Optional<Payment> optPayment=
				paymentRepository.findById(id);
		
	if(optPayment.isPresent()) {
		paymentRepository.deleteById(id);
		result = "Succes to Delete Payment Data!";
	}
	return result;
	}
	

}
