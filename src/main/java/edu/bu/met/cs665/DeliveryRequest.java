package edu.bu.met.cs665;

import edu.bu.met.cs665.subject.Shop;
/**
* Name: Lakshmi Swethadri
* Date: 02/23/2021
* Course: CS-665
* Assignment 2
* Description: Delivery Request class process orders and sends notifications to all drivers on a delivery update.
*/

public class DeliveryRequest {
	public String testDeliveryMsg; // used for junit test purpose only
	
	//process orders, handles packaging and notifies all observers(drivers)
	public String deliveryRequest(Order o, Shop s, String msg) {
		System.out.println("Order Id: " + o.getOrderId() + " is processed and ready to be dispatched");
		testDeliveryMsg="Order Id: " + o.getOrderId() + " is processed and ready to be dispatched";
		//notifying corresponding drivers(observers) for a delivery update
		System.out.println("\n************** Notifications to all corresponding drivers *************" + "\n");
		s.notifyAllObservers(msg);
		return testDeliveryMsg;						
	}	
	
}

