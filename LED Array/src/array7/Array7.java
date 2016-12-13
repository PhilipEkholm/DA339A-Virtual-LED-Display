package array7;

import exceptions.IllegalBitException;

/**
 * 	The Array7 is one of the basic classes needed to make the characters work.
 * 
 * 	@author Philip Ekholm
 * 	Class created 2016-12-07 19:04
 */

public class Array7 {
	private int[] elements;
	
	/**
	 *	Constructor to be initialized if a simple array is passed as arg.
	 *	
	 *	@param elements to pass to array
	 */
	
	public Array7(int[] elements){
		this.elements = elements;
	}
	
	/**
	 * 	Constructor to be initialized if no array is passed.
	 */
	
	public Array7(){
		this.elements = new int[7];
	}
	
	/**
	 *	Simple getter for the elements-array
	 *
	 *	@param pos position to target in array
	 *	@return specific value at position
	*/
	
	public int getElement(int pos){
		return this.elements[pos];
	}
	
	/**
	 *	Getter for getting the whole array
	 *	@return whole array
	*/
	
	public int[] getElements(){
		return this.elements;
	}
	
	/**
	 *	Simple setter for the elements-array, will throw IllegalBitException if anything else than 0s or 1s is passed in
	 *
	 *	@param pos position to target in array
	 *	@param value value to set position to
	 *	@return specific value at position
	*/
	
	public void setElement(int pos, int value) throws IllegalBitException{
		if(value < 0 || value > 1){
			throw new IllegalBitException("Illegal value passed in Array7.setElement!");
		}
		else{
			this.elements[pos] = value;
		}
	}
	
	/**
	 *	Print the whole array as string
	 *	@return String as array form 
	 */
	
	public String toString(){
		String res = "[";
		
		for(int i = 0; i < this.elements.length; i++){
			res += this.elements[i];
			
			if(i != this.elements.length - 1){
				res += ", ";
			}
		}
		
		return (res + "]");
	}
}
