package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//import com.mycompany.app.Drink.TYPE_ENUM;

public class OrderTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOrder() {
		Order order = new Order(TYPE_ENUM.coffee,SIZE_ENUM.small);
		assertEquals("verify type is coffee","coffee",order.getDrinkType());

		Order order2 = new Order(TYPE_ENUM.tea,SIZE_ENUM.small);
		assertEquals("verify type is tea","tea",order2.getDrinkType());

	}

	@Test
	public void testHowMuchSmallCoffee() {
		Order order = new Order(TYPE_ENUM.coffee,SIZE_ENUM.small);
		
		BigDecimal price = order.howMuch();
		assertEquals("verify small coffee is correct",price, new BigDecimal(1.0));
		
	}
	@Test
	public void testHowMuchMediumCoffee() {
		Order order = new Order(TYPE_ENUM.coffee,SIZE_ENUM.medium);
		
		BigDecimal price = order.howMuch();
		assertEquals("verify medium coffee is correct",price, new BigDecimal(2.0));
		
	}
	@Test
	public void testHowMuchLargeCoffee() {
		Order order = new Order(TYPE_ENUM.coffee,SIZE_ENUM.large);
		
		BigDecimal price = order.howMuch();
		assertEquals("verify large coffee is correct",price, new BigDecimal(3.0));
		
	}
	@Test
	public void testHowMuchSmallTea() {
		Order order = new Order(TYPE_ENUM.tea,SIZE_ENUM.small);
		
		BigDecimal price = order.howMuch();
		assertEquals("verify small tea is correct",price, new BigDecimal(.50));
		
	}
	@Test
	public void testHowMuchMediumTea() {
		Order order = new Order(TYPE_ENUM.tea,SIZE_ENUM.medium);
		
		BigDecimal price = order.howMuch();
		assertEquals("verify medium tea is correct",price, new BigDecimal(1.50));
		
	}
	@Test
	public void testHowMuchLargeTea() {
		Order order = new Order(TYPE_ENUM.tea,SIZE_ENUM.large);
		
		BigDecimal price = order.howMuch();
		assertEquals("verify large tea is correct",price, new BigDecimal(2.50));
		
	}
	

}
