package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.observers.TaxiDriver;
import edu.bu.met.cs665.subject.Shop;

public class TestDeliveryRequest {
	
	/**
	 *Asserts the deliveryRequest message
	 */
	@Test
	public void testDeliveryRequest() {
	TaxiDriver jin= new TaxiDriver();
	Shop dominos=new Shop("Dominos");
	dominos.register(jin);
	Order o1= new Order(1,"Veg Pizza", "Lakshmi Swethadri", "8 brattle Dr, Arlington, MA-02474");
	String msg1 = o1.placeOrder(o1,dominos,"Dominos");
	DeliveryRequest request=new DeliveryRequest();
	request.deliveryRequest(o1, dominos, msg1);
	String output=request.testDeliveryMsg;
	String expected="Order Id: " + o1.getOrderId() + " is processed and ready to be dispatched";
	assertEquals(expected,output);
	}

}
