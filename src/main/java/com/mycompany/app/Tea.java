/**
 * 
 */
package com.mycompany.app;

import java.math.BigDecimal;

/**
 * @author kathie
 *
 */
public class Tea implements Drink {
	public SIZE_ENUM drinkSize;
	public TYPE_ENUM drinkType;

	/**
	 * Injected Dependancy example
	 * set this object's type and size
	 */
	public Tea(TYPE_ENUM type, SIZE_ENUM size) {
		this.drinkType = type;
		this.drinkSize = size;
	}

	@Override
	public void setDrinkSize(SIZE_ENUM size) {
		drinkSize=size;
		
	}

	@Override
	public SIZE_ENUM getDrinkSize() {
		return drinkSize;
	}

	@Override
	public void setDrinkType(TYPE_ENUM type) {
		drinkType = type;
		
	}

	@Override
	public TYPE_ENUM getDrinkType() {
		return drinkType;
	}

	@Override
	public BigDecimal howMuch(TYPE_ENUM type, SIZE_ENUM size) {
		BigDecimal price = null;
		switch (size) {
		case small:
			price = new BigDecimal(.50);
			break;
		case medium:
			price = new BigDecimal(1.50);
			break;
		case large:
			price = new BigDecimal(2.50);
			break;
		default:
			break;
		}
	  return price;
	}
}
