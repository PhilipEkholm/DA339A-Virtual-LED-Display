package array7;

/**
 * 	The Array7 is one of the basic classes needed to make the characters work.
 * 
 * 	@author Philip Ekholm
 * 	Class created 2016-12-07 19:04
 */

public class Array7 {
	private int[] elements = new int[7];
	
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
	 *	Simple setter for the elements-array
	 *
	 *	@param pos position to target in array
	 *	@param value value to set position to
	 *	@return specific value at position
	*/
	
	public void setElement(int pos, int value){
		this.elements[pos] = value;
	}
}
