package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.observers.TaxiDriver;
import edu.bu.met.cs665.subject.Shop;

public class TestTaxiDriver {
	Shop s= new Shop("Apple");
	TaxiDriver tim=new TaxiDriver();

	/**
	 *Asserts the update notification method for Taxi Drivers
	 */
	
	@Test
	public void testUpdateNotification() {
		String msgExpected="New delivery update from Apple: Customer Name: Lakshmi Swethadri \n"+
				  "Delivery Address: 8 brattle Dr, Arlington, MA-02474";
		String msgPassed= "Customer Name: Lakshmi Swethadri \n"+
				  "Delivery Address: 8 brattle Dr, Arlington, MA-02474";
		String ouputUpdate= tim.update("Apple", msgPassed);
		assertEquals(msgExpected,ouputUpdate);
		
	}
	
}
