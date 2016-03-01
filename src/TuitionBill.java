import java.util.Scanner;

public class TuitionBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter their informations
		
		System.out.print("Enter your repayment schedule(how many years): ");
		double repSchedule = input.nextDouble();
		
		System.out.print("Enter the percentage increase for tuition of the current year: ");
		double percentIncrease = input.nextDouble();
		
		System.out.print("Enter the APR(Annual percentage rate): ");
		double apr = input.nextDouble();
		
		// Calculation
		double totalCost = 0;
		double initial = 12520;
		
		for (int i =0; i < 4; i++) {			
			totalCost += initial * Math.pow((1 + percentIncrease / 100), i);
		}
		
		double totalLoan = totalCost * Math.pow((1 + (apr / 100)), repSchedule);
		double monthly = totalLoan / repSchedule / 12;
		
		
		// Display the result
		System.out.printf("Your Total Tuition Bill is: $%.2f, and the monthly payment for your loan is: $%.2f ", totalCost, monthly);
		

	}

}
