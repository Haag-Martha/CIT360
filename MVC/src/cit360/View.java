package cit360;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
*
* @author martha
*/

public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField firstNumber  = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("=");
    private JTextField calcSolution = new JTextField(10);

    private JTextField thirdNumber  = new JTextField(10);
    private JLabel subtractionLabel = new JLabel("- ");
    private JTextField fourthNumber = new JTextField(10);
    private JButton calculateButton2 = new JButton("=");
    private JTextField calcSolution2 = new JTextField(10);

    private JTextField fifthNumber  = new JTextField(10);
    private JLabel multiplyLabel = new JLabel("*");
    private JTextField sixthNumber = new JTextField(10);
    private JButton calculateButton3 = new JButton("=");
    private JTextField calcSolution3 = new JTextField(10);

    private JTextField seventhNumber  = new JTextField(10);
    private JLabel divideLabel = new JLabel("/");
    private JTextField eigthNumber = new JTextField(10);
    private JButton calculateButton4 = new JButton("=");
    private JTextField calcSolution4 = new JTextField(10);

    View(){

        // Sets up the view and adds components

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
                
                calcPanel.add(thirdNumber);
        calcPanel.add(subtractionLabel);
        calcPanel.add(fourthNumber);
        calcPanel.add(calculateButton2);
        calcPanel.add(calcSolution2);
                
                calcPanel.add(fifthNumber);
        calcPanel.add(multiplyLabel);
        calcPanel.add(sixthNumber);
        calcPanel.add(calculateButton3);
        calcPanel.add(calcSolution3);
                
                calcPanel.add(seventhNumber);
        calcPanel.add(divideLabel);
        calcPanel.add(eigthNumber);
        calcPanel.add(calculateButton4);
        calcPanel.add(calcSolution4);

                
        this.add(calcPanel);
        // End

    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }

        public int getThirdNumber(){
        return Integer.parseInt(thirdNumber.getText());
    }

    public int getFourthNumber(){
        return Integer.parseInt(fourthNumber.getText());
    }

        public int getFifthNumber(){
        return Integer.parseInt(fifthNumber.getText());
    }

    public int getSixthNumber(){
        return Integer.parseInt(sixthNumber.getText());
    }

        public int getSeventhNumber(){
        return Integer.parseInt(seventhNumber.getText());
    }

    public int getEigthNumber(){
        return Integer.parseInt(eigthNumber.getText());
    }

    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }

        public int getCalcSolution2(){
        return Integer.parseInt(calcSolution2.getText());
    }

    public void setCalcSolution2(int solution){
        calcSolution2.setText(Integer.toString(solution));
    }

        public int getCalcSolution3(){
        return Integer.parseInt(calcSolution3.getText());
    }

    public void setCalcSolution3(int solution){
        calcSolution3.setText(Integer.toString(solution));
    }

        public int getCalcSolution4(){
        return Integer.parseInt(calcSolution4.getText());
    }

    public void setCalcSolution4(int solution){
        calcSolution4.setText(Integer.toString(solution));
    }
    // If the calculateButton is pressed, a method is executed
    // in the controller named actionPerformed

    void addCalculateListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }

        void addCalculateListener2(ActionListener listenForCalcButton){
        calculateButton2.addActionListener(listenForCalcButton);
    }

        void addCalculateListener3(ActionListener listenForCalcButton){
        calculateButton3.addActionListener(listenForCalcButton);
    }

        void addCalculateListener4(ActionListener listenForCalcButton){
        calculateButton4.addActionListener(listenForCalcButton);
    }

    // Opens a pop-up that contains the passed error message

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }	
}
