import utils.TextKit;

/** This class is used for testing another
 *  class {@link TextKit} in a different package
 *  and invoking the methods.
 *
 * @author Thomas Schlicher, Tampa Florida USA.
 * @see TextKit
 * @version 1.0
 */
   
public class TextKitApp{
	/** The main method of the TextKit application, which
	 *  invokes methods.
	 *  @param args unused
	 */
	public static void main(String[] args){
		
		// Random variable used for testing purposes only.
		int num = 6;
		
		// Catiching two exceptions of the same type, to not
		// allow negative numbers or zeros to be entered.
		
		try{
			System.out.println(TextKit.lineOfStars(5));
		} 
		catch(IllegalArgumentException e){
			System.out.println(e);
		}
		
		try{
			System.out.println( "*" + TextKit.pad(num, 0) + "*");
		}
	    catch(IllegalArgumentException ex){
			System.out.println(ex);
		}	
	}	
} 