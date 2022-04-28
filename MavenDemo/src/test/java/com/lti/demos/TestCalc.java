package com.lti.demos;





//import static org.junit.jupiter.api.Assertions.*;

//cntrl + shift + o   will remove uncertain imports


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import java.util.ArrayList;
import com.lti.Demo.Calculator;


class TestCalc {

		
	Calculator c =new Calculator();
	
	@Test
	public void testHello()
	{
		Assertions.assertEquals("Hello World", c.sayHello());
	}
	
	
	@Test
	public void testAddition()
	{
		Assertions.assertEquals(500,c.addNos(400, 100));
	}
	
	@Test
	public void testSubtraction()
	{
		Assertions.assertEquals(300,c.subNos(400, 100));
	}
	
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	
	/*@Test
	public void testEmptyArrayList() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Assertions.assertEquals(0, al.size());
	Assertions.assertTrue(al.isEmpty()); // assertTrue Method
	al.add(100);
	al.add(200);
	Assertions.assertEquals(0, al.size());
	// assertFalse(al.isEmpty());
	}*/
	

}
