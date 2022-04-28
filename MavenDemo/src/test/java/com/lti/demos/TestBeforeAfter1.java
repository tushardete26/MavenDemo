package com.lti.demos;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.Demo.Calculator;

class TestBeforeAfter1 {

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */
	
	 int sum;

	
	@Test
	public void testAddition() {
		
		System.out.println("Test addition method");
		Calculator c = new Calculator();
		int res = c.addNos(100, 300);
		Assertions.assertEquals(400, res);
	}
	@BeforeEach
	public void testStartUp()
	{
		sum=0;
		System.out.println(" sum init to zero");
	}
	
	@AfterEach
	public void testShutdown()
	{
		sum=0;
		System.out.println(" Some Var Null");
	}
	
	
	@Test
	public void testSub() {
		
		System.out.println("Test subtraction method");
		Calculator c = new Calculator();
		int res = c.subNos(500, 300);
		Assertions.assertEquals(200, res);
	}
	
	//BeforeAll n AfterAll only ONCE
	@BeforeAll
	public static void testConn() {
		System.out.println("DB Conn is up");
	}
	
	@AfterAll
	public static void testCloseConn() {
		System.out.println("DB Conn is closed");
	}
}
