package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import edu.bu.met.cs665.observers.TaxiDriver;
import edu.bu.met.cs665.subject.Shop;

public class TestShop {	
	
  /**
   * Asserts that instantiating a shop object properly sets the shop Name
   * that shop will use
   */
	@Test
	public void testShopConstructor() {
	   Shop s = new Shop("BlazePizza-Cambridge");
	   assertEquals("BlazePizza-Cambridge",s.getShopName());
	  }

   /**
	 * Asserts that an order was properly received
	 */
	@Test
	public void testReceiveOrder() {
		Shop s= new Shop("Carters");
		String outputR= s.receiveOrder("Carters"," from Zen");
		System.out.println(outputR);
		assertEquals("Carters has received order \n" + "  from Zen",outputR);		
	}
	 
    /**
	 * Asserts registering a single driver works properly
	 */
	@Test
	public void testAddObservers() {	
		TaxiDriver pam= new TaxiDriver("Pam","Taxi","5XMFFG");
		Shop s1= new Shop("Carters");
		s1.register(pam);
		assertTrue(s1.getDrivers().contains(pam));			
	}
	
   /**
   * Asserts that a driver that was previously registered was successfully removed
   */
	@Test
	public void testRemoveObservers() {	
		TaxiDriver pam= new TaxiDriver("Pam","Taxi","5XMFFG");
		Shop s1= new Shop("Carters");
		s1.unRegister(pam);;
		assertFalse(s1.getDrivers().contains(pam));				
	}
	
    /**
	 * Asserts the count as many registered drivers are notified
	*/
	@Test
	public void testNotifyAllObserversUsingCount() {
		TaxiDriver jin= new TaxiDriver("Jin","Taxi","5XMFFG");
		TaxiDriver john= new TaxiDriver("john","Taxi","4rt5f");
		Shop dominos=new Shop("Dominos");
		dominos.register(jin);
		dominos.register(john);
		Order o1= new Order(1,"Veg Pizza", "Lakshmi Swethadri", "8 brattle Dr, Arlington, MA-02474");
		String msg1 = o1.placeOrder(o1,dominos,"Dominos");
		dominos.notifyAllObservers(msg1);			
		assertEquals(2,dominos.driversCount);			
	}
	
	/**
	 * Asserts the false count for the registered drivers notification
	 */
		@Test
		public void testNotifyAllObserversCount11() {
			TaxiDriver jin= new TaxiDriver("Jin","Taxi","5XMFFG");
			Shop dominos=new Shop("Dominos");
			dominos.register(jin);
			Order o1= new Order(1,"Veg Pizza", "Lakshmi Swethadri", "8 brattle Dr, Arlington, MA-02474");
			String msg1 = o1.placeOrder(o1,dominos,"Dominos");
			dominos.notifyAllObservers(msg1);
			//2 is not equal to 1
			//one driver registered and hence 1 driver is updated
			assertNotEquals(2,dominos.driversCount);				
		}
		
	/**
	 *Asserts the driver name and contains all observers
	 */
	@Test
	public void testNotifyAllObservers() {
		TaxiDriver jin= new TaxiDriver("Jin","Taxi","5XMFFG");
		TaxiDriver sushant= new TaxiDriver("Sushant","Taxi","5XMFFG");		
		Shop dominos=new Shop("Dominos");
		dominos.register(jin);
		dominos.register(sushant);
		Order o1= new Order(1,"Veg Pizza", "Lakshmi Swethadri", "8 brattle Dr, Arlington, MA-02474");
		String msg1 = o1.placeOrder(o1,dominos,"Dominos");		
		dominos.notifyAllObservers(msg1);
		String output=dominos.testNotify;
		
		//asserting the last observer in the list
		assertEquals("Driver Sushant",output);						
		}
	
	
	
}
