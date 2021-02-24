package edu.bu.met.cs665.observers;

/**
 * Name: Lakshmi Swethadri
 * Date: 02/23/2021
 * Course: CS-665
 * Assignment 2
 * Description: Driver class to get and set driver names, vehicle type and dl No.
 *
 * */

public class Driver {
	private String driverName;
	private String vehicleType;
	private String dlNo;
	
	public Driver() {
		
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getDlNo() {
		return dlNo;
	}
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	public Driver(String driverName, String vehicleType, String dlNo) {
		super();
		this.driverName = driverName;
		this.vehicleType = vehicleType;
		this.dlNo = dlNo;
	}
	@Override
	public String toString() {
		return "Driver " + driverName;
	}
	
}
