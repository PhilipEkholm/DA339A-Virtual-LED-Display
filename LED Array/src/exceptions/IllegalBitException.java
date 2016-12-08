package exceptions;

/**
 * 	An exception to be thrown if character mapping and array-bits contain
 * 	anything else than 0:s and 1:s
 * 
 * 	Class primarily for type safety
 * 
 * 	@author Philip Ekholm
 * 	Class created 2016-12-07 19:00
 */

public class IllegalBitException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	/**
	 *	Def. Constructor
	*/
	
	public IllegalBitException(){
		super();
	}
	
	/**
	 *	Takes help message to be printed to console.
	 *
	 *	@param message message to be printed to console.
	*/
	
	public IllegalBitException(String message){
		super(message);
	}
}
