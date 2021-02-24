package edu.bu.met.cs665.observers;

import java.util.Iterator;

/**
 * Name: Lakshmi Swethadri
 * Date: 02/23/2021
 * Course: CS-665
 * Assignment 2
 * Description: Van Driver class is an observer, gets notified when there is a delivery update.
 *
 * */
public class VanDriver extends Driver implements Observer {
	
	public VanDriver() {}

	public VanDriver(String driverName, String vehicleType, String dlNo) {
		super(driverName, vehicleType, dlNo);
	}

	@Override
	//update notification sent to all van drivers
	public String update(String shopName, String msg) {
		System.out.println("New delivery update from " + shopName + ":" + " " + msg);	
		//this is used for junit only
		String junitTestMsg="New delivery update from " + shopName + ":" + " " + msg;
		return junitTestMsg;
	}
	
	
}
