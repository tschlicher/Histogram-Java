import java.util.Scanner;
import utils.TextKit;
import java.util.Arrays;

// spelled hist wrong, this new comment should be in my 'branchPractice and 
//not in master yet. 
// another change was made in a branch.

class hitsCopy{
	
	public static void main(String [] args){
		 int num = 0;//initialize 'values to 0 for array.
		
		Scanner input = new Scanner(System.in);// retrieves user input
		
		int[] numbers = new int[25 + 1]; //using an array to store values.
		System.out.println("Please enter integers between 1 - 25, oner per a line, hit conttol Z to stop. (^Z to stop): ");
		//continues to get input until ^Z has been entered
		while(input.hasNextLine()){
			
			//values is used to store all integers entered in array.
			num = Integer.parseInt(input.nextLine());
			numbers[num]++;
			
			}
		
		//need 2 for loops
		//first for loop will be to get the 25 lines
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


