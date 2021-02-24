package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;

import org.junit.Test;

import edu.bu.met.cs665.Order;
import edu.bu.met.cs665.subject.Shop;

public class TestOrder {
	/**
	 *Asserts the setters 
	 */
	Order o= new Order(1,"Carters sleep blanket, 3-6 M", "Lakshmi Swethadri", "8 brattle Dr, Arlington, MA-02474");
	Shop carters= new Shop("Carters");
	
		@Test
		public void testSetter() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
				
			//when
			o.setCustName("Lakshmi Swethadri");
			o.setCustAddress("8 brattle Dr, Arlington, MA-02474");
			
			//then
			Field field=o.getClass().getDeclaredField("custName");
			field.setAccessible(true);
			assertEquals("Fields Match", field.get(o),"Lakshmi Swethadri");
			
			Field field1=o.getClass().getDeclaredField("custAddress");
			field1.setAccessible(true);
			assertEquals("Fields Match", field1.get(o),"8 brattle Dr, Arlington, MA-02474");
			
		}
		
		/**
		 *Asserts order place message
		 */
		@Test
		public void testPlaceOrder() {
			String outputMsg= o.placeOrder(o,carters,"Carters");
			System.out.println(outputMsg);
			
			 assertEquals("Customer Name: Lakshmi Swethadri"+ "\n" +
                          "Delivery Address: 8 brattle Dr, Arlington, MA-02474", outputMsg);				
			
		}
}
