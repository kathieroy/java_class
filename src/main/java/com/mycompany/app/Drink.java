/**
 * 
 */
package com.mycompany.app;

import java.math.BigDecimal;

/**
 * @author kathie
 *
 */
public interface Drink {	
	public SIZE_ENUM drinkSize = SIZE_ENUM.small;
	public TYPE_ENUM drinkType = TYPE_ENUM.coffee;
	
	
	/**
	 * 
	 * @param size
	 */
	public void setDrinkSize(SIZE_ENUM size);
	/**
	 * 
	 * @return
	 */
	public SIZE_ENUM getDrinkSize();

	
	/**
	 * @param type
	 */
	public void setDrinkType(TYPE_ENUM type);
	/**
	 * 
	 * @return
	 */
	public TYPE_ENUM getDrinkType();
	
	/**
	 * Calculates total price for order 
	 * @param type of drink 
	 * @param size the size of the drink
	 * @return
	 */
	
	public BigDecimal howMuch(TYPE_ENUM type, SIZE_ENUM size);
}
