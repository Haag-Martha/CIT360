package cit360;

/**
*
* @author martha
*/

public class Gui {

	 private static Controller theController;

	public static void main(String[] args) {
	    	View theView = new View();
	    	Model theModel = new Model();
	        setTheController(new Controller(theView,theModel));
	        theView.setVisible(true);
	    }

	public static Controller getTheController() {
		return theController;
	}

	public static void setTheController(Controller theController) {
		Gui.theController = theController;
	}
	}

