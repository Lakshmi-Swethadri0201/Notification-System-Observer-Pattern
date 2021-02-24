package edu.bu.met.cs665;

import edu.bu.met.cs665.subject.Shop;

/**
 * Name: Lakshmi Swethadri
 * Date: 02/23/2021
 * Course: CS-665
 * Assignment 2
 * Description: Order class to place order in a specific shop.
 *
 * */

public class Order {
	
	protected int orderId;
	protected String product;
	protected String custName;
	protected String custAddress;
	
	public Order(int orderId, String product, String custName, String custAddress) {
		super();
		this.orderId = orderId;
		this.product = product;
		this.custName = custName;
		this.custAddress = custAddress;
	}		
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + ", custName=" + custName + ", custAddress="
				+ custAddress + "]";
	}
	
	/**
	   * Create a customer order.
	   * @param o the Order object in the order.
	   * @param s the shop object 
	   * @param shopName the store from where the products was ordered.
	   * @return msg the customer name and delivery address
	   */	
	public String placeOrder(Order o, Shop s, String shopName) {
		//order placed from customer
		String msg= "Customer Name: " + custName + "\n"  + "Delivery Address: " + custAddress ;
		String orderRecdMsg=s.receiveOrder(shopName,msg);
		System.out.println(orderRecdMsg);
		return msg  ;			
	}
	
	
	
}
