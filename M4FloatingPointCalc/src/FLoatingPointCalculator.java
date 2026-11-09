import java.util.Scanner;

public class FLoatingPointCalculator {

	 int count = 0;
	 double total = 0;
	 double number;
	 double average;
     double maximum;
	 double minimum;
	 double interest;
	 
	 public void collectNumbers(Scanner input) {

		    while (count < 5) {

		        System.out.print("Enter number " + (count + 1) + ": ");
		        number = input.nextDouble();

		        total += number;

		        if (count == 0) {
		            maximum = number;
		            minimum = number;
		        } else {
		            if (number > maximum) {
		                maximum = number;
		            }

		            if (number < minimum) {
		                minimum = number;
		            }
		        }

		        count++;
		    }
		}
	 
	 public void calculateResults() {

		    average = total / 5;
		    interest = total * 0.20;

		}
	 
	 public void displayResults() {

		    System.out.println("\nCALCULATION RESULTS ");
		    System.out.printf("Total: %.2f%n", total);
		    System.out.printf("Average: %.2f%n", average);
		    System.out.printf("Maximum: %.2f%n", maximum);
		    System.out.printf("Minimum: %.2f%n", minimum);
		    System.out.printf("Interest at 20%%: %.2f%n", interest);

		}



	
}
