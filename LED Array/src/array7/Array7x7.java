package array7;
import characters.Characters;

/**
 * 	The Class Array 7x7 is an extended version of the two dimensional
 * 	Integer-array.
 * 
 * 	@author Philip Ekholm
 * 	Class created 2016-12-04 16:01
 */

public class Array7x7 {
	private int[][] representation;
	
	/**
	 *	Starts up an Array7x7 and sets character representation.
	 *	This constructor will be called if getChar in characters is called.
	 *	@param representation display character 
	*/
	
	public Array7x7(int[][] character){
		this.representation = character;
	}
	
	/**
	 *	Starts up Array7x7. If no representation passed as argument it will
	 *	show the unknown symbol. 
	*/
	
	public Array7x7(){
		this.representation = Characters.UNKNOWN;
	}
	
	/**
	 *	Simple getter for the representation-array
	 *
	 *	@param pos position to target in array
	 *	@return specific value at position
	*/
	
	public int getElement(int row, int col){
		return this.representation[row][col];
	}
	
	/**
	 *	Simple setter for the elements-array
	 *
	 *	@param pos position to target in array
	 *	@param value value to set position to
	 *	@return specific value at position
	*/
	
	public void setElement(int row, int col, int value){
		this.representation[row][col] = value;
	}
	
	/**
	 *	A getter for collecting an entire Array7x7 row. Note that index starts at 0,
	 *	just like normal arrays. 
	 *
	 *	Please access arrays using getters and 
	 *	setters, even internally for consistency reasons.
	 *
	 *	@param pos position to target in array
	 *	@param value value to set position to
	 *	@return specific value at position
	*/
	
	public Array7 getRow(int row){
		Array7 arr = new Array7();
		
		for(int i = 0; i < this.representation.length; i++){
			arr.setElement(i, this.getElement(row, i));
		}
		
		return arr;
	}
	
	/**
	 * 	Set a whole row of the array
	 * 
	 * 	@param row to target in array, starts at 0
	 * 	@param newRowValue to overwrite the row with
	 */
	
	public void setRow(int row, Array7 newRowValue){
		this.representation[row] = newRowValue.getElements();
	}
	
	/**
	 * 	Get a whole column of values
	 * 
	 * 	@param col column to access, starts at 0
	 * 	@return Array7 of column values
	 */
	
	public Array7 getCol(int col){
		Array7 arr = new Array7();
		
		for(int i = 0; i < this.representation.length; i++){
			arr.setElement(i, this.representation[i][col]);
		}
		
		return arr;
	}
	
	/**
	 *	Set a whole column of values 
	 *
	 *	@param col column to access, starts at 0
	 *	@param newColValue to overwrite the column with
	*/
	
	public void setCol(int col, Array7 arr){
		for(int i = 0; i < this.representation.length; i++){
			this.representation[i][col] = arr.getElements()[i];
		}
	}
}













