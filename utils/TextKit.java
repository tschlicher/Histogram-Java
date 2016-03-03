package utils;
/** TextKit has a <code>lineOfStars<code> method
 *  that returns a string, and a <code>pad<code>
 *  method that will also return a string.
 *  
 *  @author Thomas Schlicher, Tampa Florida USA.
 *  @see TextKitApp
 *  @version 1.0
 */
public class TextKit{
	
	/** A <i>method</i> that when called by the TextKitApp class's main 
	 *  method will return a line of stars based on an integer.
	 *  
	 *  @param numberOfStars An <code>int<code> used to print out a certain
	 *  number of stars.
	 */
	public static String lineOfStars(int numberOfStars) throws IllegalArgumentException{
		
		/** A string used to initialize the number of stars. */
		String star = "";
		
		// used <= 0 for the reason that if 0 is entered then no numbers will be displayed
		if(numberOfStars <= 0){
				 throw new IllegalArgumentException("Number of stars cannot be a negative number or the number zero.");
			}
		
		//could have used a while loop here but I deemed a for loop to be better for my situation.
		for(int counter = 0; counter < numberOfStars; counter++){
			
			star =  star + "*";
			
		}
		return star;
	}
	
		/** A <i>method</i> used to add padding to the left of a variable.
		 *  
		 *  @param formatNumber The number that will be formatted with padding to the left.
		 *  @param stringLength The total length of a string including the padding.
		 */
		public static String pad(int formatNumber, int stringLength) throws IllegalArgumentException{
		
		/** A string used to initialize the amount of padding. */
		String formattedString = "";
		
		//throwing exception to make sure a non negative number is entered
		if(stringLength <= 0){
			throw new IllegalArgumentException("Width format number cannot be a negative number or a zero.");
		}
		
		//checks to see if the number to format holds more digits then the actual string lengthjav
		if(formatNumber > stringLength){
			String number = "" + formatNumber;
			return number;
		}
		
			for(int i = 0; i < stringLength; i++){
				
				formattedString = " " + formatNumber;
			}	
		return	formattedString;		
	}
}
