package com.lti.Demo;

public class TestCalculator {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		System.out.println("Sum of Given no's is :" + c.addNos(100, 200));
		System.out.println("----------");
		System.out.println("subtract of Given no's :is " + c.subNos(500,100));

	}

}