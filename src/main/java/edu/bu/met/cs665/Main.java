package edu.bu.met.cs665;

import edu.bu.met.cs665.observers.TaxiDriver;
import edu.bu.met.cs665.observers.VanDriver;
import edu.bu.met.cs665.subject.Shop;

/**
* Name: Lakshmi Swethadri
* Date: 02/23/2021
* Course: CS-665
* Assignment 2
* Description: Main class to instantiate shop and driver objects.
* Adds, removes observers, place orders and request delivery update
*/
public class Main {
	
	public static void main(String[] args) {
		
		//Instantiate shop object
		//There are 2 shops: walmart and target associated with Shop consortium
		Shop walmart=new Shop("Walmart");
		Shop target=new Shop("Target");
		
		//Instantiate delivery request object
		DeliveryRequest request= new DeliveryRequest();
		
		//creating 5 taxi drivers
		//TaxiDriver(String name, String vehicleType, String dlNo")
		TaxiDriver tom= new TaxiDriver("Tom","Taxi","5XMFFG");
		TaxiDriver henry= new TaxiDriver("Henry", "Taxi" , "2XC666");
		TaxiDriver elizabeth= new TaxiDriver("Elizabeth", "Taxi" , "4RW66");
		TaxiDriver steive= new TaxiDriver("Steive", "Taxi" , "QML778");
		TaxiDriver jay= new TaxiDriver("Jay", "Taxi" , "V56YHG");
		
		//creating 2 van drivers
		VanDriver abby= new VanDriver("Abby","Van","SDX345");
		VanDriver daisy= new VanDriver("Daisy","Van","VBN899");
		
		//registering 4 taxi drivers and 1 van driver for walmart shop
		System.out.println("******* Registering drivers to shops ******** \n");
		walmart.register(tom);
		walmart.register(henry);
		walmart.register(elizabeth);		
		walmart.register(steive);
		walmart.register(daisy);
		System.out.println("\n");
		
		//registering 1 taxi and 1 van driver for target shop
		target.register(jay);
		target.register(abby);
		System.out.println("\n");
		
		
		System.out.println("*************** Order Entry: walmart *************" + "\n");
		
		//create an order entry for shop Walmart	
		Order o1= new Order(1,"Samsung LCD TV 48 inch", "Lakshmi Swethadri", "8 brattle Dr, Arlington, MA-02474");
		String msg1 = o1.placeOrder(o1,walmart,"Walmart");
		request.deliveryRequest(o1,walmart,msg1);
		
		//unregister drivers tom and henry from walmart.
		System.out.println("\n********* unregistration details ******** \n");
		walmart.unRegister(tom);
		walmart.unRegister(henry);
				
		System.out.println("\n*************** New Order Entry: walmart *************" + "\n");		
		//new order for walmart
		Order o2= new Order(2,"Graco High Chair", "Abhishek Murthy", "10 charles brattle Dr, Woburn, MA-01801");
		String msg2 = o2.placeOrder(o2,walmart,"Walmart");
		//notification should go only to 3 drivers after removing 2 previous drivers tom and henry
		request.deliveryRequest(o2,walmart,msg2);
				
		System.out.println("*************** Order Entry: Target *************" + "\n");		
		//placing order to target 
		Order o3= new Order(3,"Steel cut Oats", "zen Mccord", "3 charles town, ChiinaTown, MA-08661");
		String msg3 = o3.placeOrder(o3,target,"Target");
		request.deliveryRequest(o3,target,msg3);	
}
	
}
