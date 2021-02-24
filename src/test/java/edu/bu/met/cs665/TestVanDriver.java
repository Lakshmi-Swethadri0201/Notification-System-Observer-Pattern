package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import edu.bu.met.cs665.observers.VanDriver;
import edu.bu.met.cs665.subject.Shop;

public class TestVanDriver {
	Shop s= new Shop("Apple");
	VanDriver tim=new VanDriver();
	
	/**
	 *Asserts the update notification method for Van Drivers
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
