package cit360;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author martha
 */

public class Controller {

	private View theView;
    private Model theModel;
    
    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;
        
        
        this.theView.addCalculateListener(new CalculateListener());
                this.theView.addCalculateListener2(new CalculateListener2());
                this.theView.addCalculateListener3(new CalculateListener3());
                this.theView.addCalculateListener4(new CalculateListener4());
    }
    
    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;
            
            try{
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            }

            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You need to enter two integers");
            }
        }
    }
        class CalculateListener2 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            int thirdNumber, fourthNumber = 0;

            try{
                thirdNumber = theView.getThirdNumber();
                fourthNumber = theView.getFourthNumber();
                theModel.subtractTwoNumbers(thirdNumber, fourthNumber);
                theView.setCalcSolution2(theModel.getCalculationValue());
            }

            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You need to enter two integers");  
            }
        }
    }
        class CalculateListener3 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            int fifthNumber, sixthNumber = 0;
            
            try{
                fifthNumber = theView.getFifthNumber();
                sixthNumber = theView.getSixthNumber();
                theModel.multiplyTwoNumbers(fifthNumber, sixthNumber);
                theView.setCalcSolution3(theModel.getCalculationValue());
            }

            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter two integers");
            }
        }
    }
        class CalculateListener4 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            int seventhNumber, eigthNumber = 0;

            try{
                seventhNumber = theView.getSeventhNumber();
                eigthNumber = theView.getEigthNumber();
                if (eigthNumber == 0){
                                    theView.displayErrorMessage("Can't divide by zero!");
                                } else{
                theModel.divideTwoNumbers(seventhNumber, eigthNumber);
                                
                theView.setCalcSolution4(theModel.getCalculationValue());
                                }
            }

            catch(NumberFormatException ex){
                
                System.out.println(ex);
                
                theView.displayErrorMessage("You need to enter two integers");
            }
        }
    }	
}
