import java.util.Scanner;
import utils.TextKit;
import java.util.Arrays;

class hitsCopy{
	
	public static void main(String [] args){
		 int num = 0;//initialize 'values to 0 for array.
		
		Scanner input = new Scanner(System.in);// retrieves user input
		
		int[] numbers = new int[25 + 1]; //using an array to store 200 values which is how many elements my array can hold.
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


'calculates the pay per the current user only
        Dim PricePerPieceDecimal As Decimal
        Try
            'checks to make sure a user enters a name
            If String.IsNullOrEmpty(nameTextBox.Text) Then
                MessageBox.Show("You must enter a name.",
                 "Data Entry Error", MessageBoxButtons.OK,
                MessageBoxIcon.Exclamation)
                With nameTextBox
                    .Focus()
                    .SelectAll()
                End With
            End If

            'calculates the prices
            NumberOfPiecesInteger = Integer.Parse(numberOfPiecesTextBox.Text)
            AmountEarnedDecimal = PayRate(PricePerPieceDecimal, NumberOfPiecesInteger)
            AmountEarnedTextBox.Text = AmountEarnedDecimal.ToString("C")
            TotalNumberOfPiecesInteger += NumberOfPiecesInteger

            'adds totals and resets for new customer

            TotalPay += AmountEarnedDecimal
            AmountEarnedDecimal = 0
            CustomerCountInteger += 1
            AveragePayDecimal = TotalPay / CustomerCountInteger

        Catch NumberOfPiecesException As FormatException
            MessageBox.Show("You must enter a numeric value.",
            "Data Entry Error", MessageBoxButtons.OK,
            MessageBoxIcon.Stop)
            With numberOfPiecesTextBox
                .Focus()
                .SelectAll()
            End With
        End Try
		
		
		
		  Dim SummaryTotalPieces, SummaryCustomerCount As Integer
        Dim SummaryMessage As String
        Dim SummaryTotalPay As Integer
        Dim SummaryAveragepay As Decimal

        SummaryTotalPieces = TotalNumberOfPiecesInteger.ToString("D")
        SummaryTotalPay = TotalPay.ToString("C")
        SummaryAveragePay = AveragePayDecimal.ToString("C")
        SummaryCustomerCount = CustomerCountInteger.ToString("D")

        SummaryMessage = "Number of Workers:  " & SummaryCustomerCount & Environment.NewLine & "Number of pieces:   " & SummaryTotalPieces & Environment.NewLine & "Average pay:  " &
        SummaryAveragepay & Environment.NewLine & "Total wage payment:  " & SummaryTotalPay

        MessageBox.Show(SummaryMessage, "Wage Summary", MessageBoxButtons.OK)