package com.example.pemesanan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pemesanan.model.Order;
import com.example.pemesanan.repository.OrderRepository;
import com.example.pemesanan.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		
		return orderRepository.findAll();
	}
	
	@Override
	public String regOrder(Order req) {
		String result = "Failed to register Order Data!";
		if(req != null) {
			orderRepository.save(req);
			result = "Succes to register Order Data!";
		}
		return result;
	}
	
	@Override
	public String updOrder (Order req) {
		String result = "Failed to Update Order Data!";
		
		Optional<Order> optOrder=
				orderRepository.findById(req.getIdOrder());
		
		if(optOrder.isPresent()) {
			orderRepository.save(req);
			result = "Succes to Update Order Data!";
			
		}
		return result;
	} 
	@Override
	public String delOrder(String id) {
		String result = "Failed to Delete Order Data!";
		
		Optional<Order> optOrder=
				orderRepository.findById(id);
		
	if(optOrder.isPresent()) {
		orderRepository.deleteById(id);
		result = "Succes to Delete Order Data!";
	}
	return result;
	}
	

}
