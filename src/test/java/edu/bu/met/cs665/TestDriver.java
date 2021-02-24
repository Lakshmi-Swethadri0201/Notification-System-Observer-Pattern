package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;

import org.junit.Test;

import edu.bu.met.cs665.observers.Driver;

public class TestDriver {
	
	/**
	 *Asserts the getters and setters
	 *
	 * */
	
	@Test //test setter
	public void testSetter_setName() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Driver d1 = new Driver();
        //when
        d1.setDriverName("Vivaan");
        
      //then
        Field s= d1.getClass().getDeclaredField("driverName");
        s.setAccessible(true);
        assertEquals("Fields match", s.get(d1), "Vivaan");
	}
	
	@Test //test setter
	public void testSetter_setvehicleType() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Driver d2 = new Driver();
        //when
        d2.setVehicleType("Taxi");
        
      //then
        Field s= d2.getClass().getDeclaredField("vehicleType");
        s.setAccessible(true);
        assertEquals("Fields match", s.get(d2), "Taxi");
	}
	
	@Test //test getter
	public void testGetter_getdriverName() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Driver d1 = new Driver();
        Field s= d1.getClass().getDeclaredField("driverName");
        s.setAccessible(true);
        s.set(d1, "Johnny");

        //when
        final String result = d1.getDriverName();
        
      //then
        assertEquals("field retreived properly", result, "Johnny");
	}

}
