import java.util.Scanner;
import utils.TextKit;
import java.util.Arrays;

// Histogram.java - A demonstration of array usage and
// how to read in numbers and then call a method "lineOfStars".
// This program calls lineOfStars which will draw out a lin of asteriks
// for every time a same number appears.
//
// Written 2015 by Thomas Schlicher, Tampa FL USA.

class Histogram{
	
	public static void main(String [] args){
		 int num = 0;
		
		Scanner input = new Scanner(System.in);
		
		//25 + 1 allows numbers 1 -25.
		int[] numbers = new int[25 + 1]; 
		
		System.out.println("Please enter integers between 1 - 25, oner per a line,\n hit conttol Z to stop. (^Z to stop): ");
		
		//continues to get input until ^Z has been entered
		while(input.hasNextLine()){
			
			//num is used to read in all user input and has been set to 0..
			num = Integer.parseInt(input.nextLine());
			
			//using if else statement here to check that user's input is between 1 and 25.
			if(num <= 0 || num > 25){
				System.out.println("You must enter an integer between 1 and 25.");
			}
			else{
			numbers[num]++;
			}
		}
		
		//starting my count at one since user's can only enter numbers 1 - 25.
		for(int count = 1; count < numbers.length; count++){ 
		
		//using an if - else statement because the lineOfStars() does not accept anything <= 0.
			if(numbers[count] == 0){
				System.out.println(count + ": ");
			}
			else{
					System.out.println(count + ": " + TextKit.lineOfStars(numbers[count]));
			}
		}
	}
}