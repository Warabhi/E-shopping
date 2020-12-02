package com.abhi.eshop.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order {
	
	private long id;
	private String ordercategory;
	private String deliveryboy;
	private int amount;
	private int discount;
	private Timestamp date;
	
	public Order() {
		
	}

	public Order(long id, String ordercategory, String deliveryboy, int amount, int discount, Timestamp date) {
		super();
		this.id = id;
		this.ordercategory = ordercategory;
		this.deliveryboy = deliveryboy;
		this.amount = amount;
		this.discount = discount;
		this.date = date;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrdercategory() {
		return ordercategory;
	}

	public void setOrdercategory(String ordercategory) {
		this.ordercategory = ordercategory;
	}

	public String getDeliveryboy() {
		return deliveryboy;
	}

	public void setDeliveryboy(String deliveryboy) {
		this.deliveryboy = deliveryboy;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
	 



	

}
