/**
 * 
 */
package com.mycompany.app;

import java.math.BigDecimal;

/**
 * @author kathie
 *
 */
public class Coffee implements Drink {
	public SIZE_ENUM drinkSize;
	public TYPE_ENUM drinkType;

/**
 * 
 */
	@Override
	public String toString() {
		return "Coffee [drinkSize=" + drinkSize + ", drinkType=" + drinkType + "]";
	}

	// constructor - passing size
	public Coffee(TYPE_ENUM type, SIZE_ENUM size) {
		this.drinkSize = size;
		this.drinkType = type;
	}
/**
 * @param
 * takes in the size of the drink
 */
	@Override
	public void setDrinkSize(SIZE_ENUM size) {
		this.drinkSize = size;
	}
/**
 * @return
 * returns the size of the coffee
 */
	@Override
	public SIZE_ENUM getDrinkSize() {
		return drinkSize;
	}
	/**
	 * 
	 */
	@Override
	public TYPE_ENUM getDrinkType() {
		return drinkType;
	}
	/**
	 * 
	 */
	@Override
	public void setDrinkType(TYPE_ENUM type) {
		drinkType = type;
	}
	/**
	 * @param size
	 */
	@Override
	public BigDecimal howMuch(TYPE_ENUM type, SIZE_ENUM size) {
		BigDecimal price = null;
		switch (size) {
		case small:
			price = new BigDecimal(1.00);
			break;
		case medium:
			price = new BigDecimal(2.00);
			break;
		case large:
			price = new BigDecimal(3.00);
			break;
		default:
			break;
		}
	  return price;
	}



}
