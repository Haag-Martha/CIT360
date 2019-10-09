package cit360;

/**
*
* @author martha
*/

public class Model {

	 private View theView;

	    // Holds the value of the sum of the numbers
	    // entered in the view
	    
	    private int calculationValue;
	    
	    public void addTwoNumbers(int firstNumber, int secondNumber){
	        calculationValue = firstNumber + secondNumber;
	    }
	    public void subtractTwoNumbers(int thirdNumber, int fourthNumber){
	        calculationValue = thirdNumber - fourthNumber;
	    }
	        public void multiplyTwoNumbers(int fifthNumber, int sixthNumber){
	        calculationValue = fifthNumber * sixthNumber;
	    }
	        public void divideTwoNumbers(int seventhNumber, int eigthNumber){       
	                    calculationValue = seventhNumber / eigthNumber;
	    }
	    public int getCalculationValue(){
	        return calculationValue;
	    }
		public View getTheView() {
			return theView;
		}
		public void setTheView(View theView) {
			this.theView = theView;
		}
}
