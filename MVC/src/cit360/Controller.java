package cit360;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//this controller will handle everything between model and view
public class Controller {

	private View theView;
	private Model theModel;

	//constructor for the model and view
	public Controller(View theView, Model theModel ) {
	
		this.theView =theView;
		this.theModel=theModel;
		
		this.theView.addCalculateMortgageListener(new CalculateListener());
	}
	//constructor for the listener to "hear" what's happening in the view
	class CalculateListener implements ActionListener{
		//ensure the user enters all the required info before hitting the calculate button
		public void actionPerformed(ActionEvent arg0) {
			double price=0;
			int years=0;
			double downPayment=0;
			
		//get the information typed in to the view from the user
			try {
				price = theView.getPrice();
				years = theView.getYears();
				downPayment= theView.getDownPayment();
				//call the model to make the calculation
				theModel.calculateMortgage(price, years, downPayment);
				//tell the view to set the calculation from the model
				theView.setCalculateMortgage(theModel.getMortgagePayment());
				
				//catch error if a field is left empty by the user
			}catch(NumberFormatException e) {
				theView.errorMessage("Please fill in all fields");
			}
		}
	}
}

