package com.example.pemesanan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "PAYMENT", schema= "HR")
@Entity
public class Payment {

	@Id
	@Column(name ="ID_PAYMENT")
	private String idPayment;
	
	@Column(name ="ID_ORDER")
	private String idOrder;
	
	@Column(name ="ID_CUSTOMER")
	private String idCustomer;
	
	@Column(name ="SUBTOTAL")
	private Integer subtotal;
	
	@Column(name ="SHIPPING")
	private Integer shipping;
	
	@Column(name ="TOTAL")
	private Integer total;

	public String getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(String idPayment) {
		this.idPayment = idPayment;
	}

	public String getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(String idOrder) {
		this.idOrder = idOrder;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public Integer getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Integer subtotal) {
		this.subtotal = subtotal;
	}

	public Integer getShipping() {
		return shipping;
	}

	public void setShipping(Integer shipping) {
		this.shipping = shipping;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	
}
