import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner input = new Scanner(System.in);

	        FLoatingPointCalculator calculator = new FLoatingPointCalculator();

	        System.out.println("Floating Point Number Calculator");
	        System.out.println("Please enter five decimal numbers.");

	        calculator.collectNumbers(input);
	        calculator.calculateResults();
	        calculator.displayResults();

	        input.close();
		
	}

}
