package cit360;

//create model
public class Model {

	//the calculated mortgage payment for the user
	private double mortgagePayment;
	
	public void calculateMortgage(double price, int years, double downPayment) {
		//create variables
		double interestRate = 0;
		double remainingBalance = price - downPayment;
		int months = years * 12;

 
		//tell program what interest rate to use depending on what user enters for term
		if (years == 15) {
			interestRate = .03;
		} else if (years == 30) {
			interestRate = .04;

		}

		//calculate payment
		mortgagePayment = Math.round(((interestRate / 12) * remainingBalance)
				/ (1 - Math.pow((1 + (interestRate / 12)), -months)));

		
	}
	// method to get the mortgage payment from the model
	public double getMortgagePayment() {
		return mortgagePayment;
	}
}
