package cit360;

import java.awt.event.ActionListener;
import javax.swing.*;

//This view is the only thing the user will see.  It gives it a prettier look than the console
public class View extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//create labels, input boxes and a button
	private JLabel priceLabel = new JLabel("Cost of the Home");
	private JTextField price = new JTextField(10);
	private JLabel yearsLabel = new JLabel("Loan Term in Years (15 or 30)");
	private JTextField years = new JTextField(4);
	private JLabel downPaymentLabel = new JLabel("Down Payment");
	private JTextField downPayment=new JTextField(10);
	private JButton calculateButton =new JButton("Calculate Mortgage Payment");
	private JTextField calculateMortgage = new JTextField(10);
	private JLabel disclaimerLabel =new JLabel("Taxes and insurance are not included.");
	
	//method to set up the interface for the user
	View(){
		/*create a new JPanel*/
		JPanel calculatePanel = new JPanel();
		// tell the system to exit when user closes the panel
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//size the panel
		this.setSize(600,200);
		
		//add the parts of the calculator to the panel
		calculatePanel.add(priceLabel);
		calculatePanel.add(price);
		calculatePanel.add(yearsLabel);
		calculatePanel.add(years);
		calculatePanel.add(downPaymentLabel);
		calculatePanel.add(downPayment);
		calculatePanel.add(calculateButton);
		calculatePanel.add(calculateMortgage);
		calculatePanel.add(disclaimerLabel);
		//adds calculatePanel to the JFrame
		this.add(calculatePanel);
	}
		
	public double getPrice() {
		//change the price to a double
		return Double.parseDouble(price.getText());
	}
	public int getYears() {
		//change years into int
		return Integer.parseInt(years.getText());
	}
	public double getDownPayment() {
		//down payment to double
		return Double.parseDouble(downPayment.getText());
	}
	public double getcalculateMortgage() {
		//change payment to double
		return Double.parseDouble(calculateMortgage.getText());
	}
	
	//convert double to string for display in the panel
	public void setCalculateMortgage(double mortgage) {
		calculateMortgage.setText(Double.toString(mortgage));
	}
	
	//need to alert controller when button is pressed since the view is blind
	void addCalculateMortgageListener(ActionListener CalculateMortgageButton) {
		calculateButton.addActionListener(CalculateMortgageButton);
	}
	//send error message to user if fields are empty
	void errorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
