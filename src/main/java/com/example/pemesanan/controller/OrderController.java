package com.example.pemesanan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pemesanan.model.Order;
import com.example.pemesanan.service.OrderService;

@CrossOrigin
@RestController
@RequestMapping("api/pemesanan/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping
	public List<Order>findAll() {
		return orderService.findAll();
	}
	
	@PostMapping
	public String regOrder(@RequestBody Order req) {
		return orderService.regOrder(req);
	}
	
	@PutMapping
	public String updOrder(@RequestBody Order req) {
		return orderService.updOrder(req);
	}
	
	@DeleteMapping("{idOrder}")
	public String delOrder(@PathVariable String idOrder) {
		return orderService.delOrder(idOrder);
	}
	
	
	
	
}