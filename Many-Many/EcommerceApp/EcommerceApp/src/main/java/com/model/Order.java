package com.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import net.bytebuddy.utility.nullability.MaybeNull;
//@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String deliveryPersonName;
	public LocalDateTime deliveredAt;
	public String modeOfPayment;
	public long total;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "OrdersHistory",
			joinColumns = @JoinColumn(name="order_id"),
			inverseJoinColumns = @JoinColumn(name="product_id"))
	public List<Product> orderSummery;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String deliveryPersonName, LocalDateTime deliveredAt, String modeOfPayment, long total,
			List<Product> orderSummery) {
		super();
		this.id = id;
		this.deliveryPersonName = deliveryPersonName;
		this.deliveredAt = deliveredAt;
		this.modeOfPayment = modeOfPayment;
		this.total = total;
		this.orderSummery = orderSummery;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeliveryPersonName() {
		return deliveryPersonName;
	}
	public void setDeliveryPersonName(String deliveryPersonName) {
		this.deliveryPersonName = deliveryPersonName;
	}
	public LocalDateTime getDeliveredAt() {
		return deliveredAt;
	}
	public void setDeliveredAt(LocalDateTime deliveredAt) {
		this.deliveredAt = deliveredAt;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<Product> getOrderSummery() {
		return orderSummery;
	}
	public void setOrderSummery(List<Product> orderSummery) {
		this.orderSummery = orderSummery;
	}
	
	

}
