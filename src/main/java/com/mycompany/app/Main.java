/**
 * 
 */
package com.mycompany.app;


/**
 * @author kathie
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
 
		Order order = new Order(TYPE_ENUM.coffee,SIZE_ENUM.small);
		System.out.println(TYPE_ENUM.coffee + " " + SIZE_ENUM.small + " $" + order.howMuch());
		
	}

}
