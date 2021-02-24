package edu.bu.met.cs665.subject;

import java.util.ArrayList;
import java.util.Collection;

import edu.bu.met.cs665.observers.Observer;

/**
 * Name: Lakshmi Swethadri
 * Date: 02/23/2021
 * Course: CS-665
 * Assignment 2
 * Description: Shop class is an observable, it receives orders and notifies all observers.
 *
 * */

public class Shop implements Observable {
	private String shopName;
	private ArrayList<Observer> drivers; 
	public String testNotify; // this variable is used to junit test case only
	public int driversCount;// this variable is used to junit test case only
		
	//default constructor
	public Shop() {}

	public Shop(String shopName) {
		this.shopName = shopName;
		drivers=new ArrayList<Observer>();
	}
	
	//getters and setters
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public ArrayList<Observer> getDrivers() {
		return drivers;
	}

	public void setDrivers(ArrayList<Observer> drivers) {
		this.drivers = drivers;
	}

	/**
	 * adds driver to the observers list.
	 * 
	 * @param observer 
	 */
	@Override
	public void register(Observer o) {
		drivers.add(o);
		System.out.println(o + " has registered to " + shopName);		
	}

	/**
	  * removes driver from observers list.
	  * 
	  * @param observer 
	  */
	@Override
	public void unRegister(Observer o) {
		drivers.remove(o);
		System.out.println(o + " has unregistered from " + shopName );		
	}

	/**
	 * Notifies all drivers on a delivery update.
	 * 
	 * @param message the order message from shop.
	 */

	@Override	
	public void notifyAllObservers(String message) {
		driversCount=0;
			for(Observer driver:drivers) {	
				testNotify=driver.toString();
				System.out.println(testNotify);
				System.out.println("----" + testNotify + " is notified");
				driver.update(shopName, message);	
				driversCount++;
			}				
		System.out.println();
		System.out.println("Total number of drivers updated: " + driversCount);		
	}
	
	/**
	 * Receives an order.
	 * 
	 * @param shopName the name of the shop
	 * @param msg the message includes customer name and delivery address
	 * @return shop name and order received message
	 */

	public String receiveOrder(String shopName, String msg) {
		return shopName + " has received order \n " + msg;		
	}	

}
