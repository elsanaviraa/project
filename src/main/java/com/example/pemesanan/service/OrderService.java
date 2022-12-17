package com.example.pemesanan.service;

import java.util.List;
import com.example.pemesanan.model.Order;

public interface OrderService {

	public List<Order> findAll();
	public String regOrder(Order req);
	public String updOrder(Order req);
	public String delOrder(String id);
}

