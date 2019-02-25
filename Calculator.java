/**
 * Sam Marple - 470
 * CSE 360 - Assignment 3
 * 
 * Practice using GitHub with Calculator class
 */

package cse360assign3;

/**
 * Calculator class will add, subtract, multiply, and divide.
 * @param total	Stores the total of the calculations.
 * @param history	Stores the history of operations
 * @author samiam
 *
 */
public class Calculator {

	private int total;
	private String history ;
	
	/**
	 * Creates Calculator object.
	 * Stores total over course of calculations.
	 * Creates initial history of 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0" ;
	}
	
	/**
	 * Getter for total variable.
	 * @return 0
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds value to total. Adds operation to history.
	 * @param value	The value user wants to add.
	 * @return void
	 */
	public void add (int value) {
		total += value ;
		history += " + " + value ;
	}
	
	/**
	 * Subtracts a value from total. Adds operation to history.
	 * @param value	The value user wants to subtract.
	 * @return void
	 */
	public void subtract (int value) {
		total -= value ;
		history += " - " + value ;
	}
	
	/**
	 * Multiplies total by a value. Adds operation to history.
	 * @param value	The value user wants to multiply by.
	 * @return void
	 */
	public void multiply (int value) {
		total *= value ;
		history += " * " + value ;
	}
	
	/**
	 * Divides total by a value. Adds operation to history.
	 * @param value	The value user wants to divide by.
	 * @return void
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0 ;
		else
			total /= value ;
		history += " / " + value ;
	}
	
	/**
	 * Gives the history of the calculations done on the Calculator object.
	 * @return String	History of calculations.
	 */
	public String getHistory () {
		return history;
	}
}