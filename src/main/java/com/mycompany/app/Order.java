/**
 * 
 */
package com.mycompany.app;

import java.math.BigDecimal;

enum SIZE_ENUM {
	small, medium, large
}

enum TYPE_ENUM {
	coffee, tea
}

/**
 * @author kathie
 *
 */
public class Order {
	private Drink drink;
	private String dType = " ";

	/**
	 * 
	 * @param type, size - must specify drink type and size
	 */

	public Order(TYPE_ENUM type, SIZE_ENUM size) {
		switch (type) {
		case coffee:
			Coffee coffee = new Coffee(type, size);
			this.drink = coffee;
			this.dType = "coffee";
			break;
		case tea:
			Tea tea = new Tea(type, size);
			this.drink = tea;
			this.dType = "tea";
			break;
		default:
			break;
		}
	}

	/**
	 * returns the price of the drink
	 * 
	 * @return
	 */
	public BigDecimal howMuch() {
		return drink.howMuch(drink.getDrinkType(), drink.getDrinkSize());

	}

	public Object getDrinkType() {
		return dType;
	}
	
	

}
