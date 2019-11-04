package cit360;
//create object
public class MVC {

	public static void main(String[] args) {
		//create view
		View theView = new View();
		
		//create model
		Model theModel= new Model();
		
		//create controller to work between the model and view
		Controller theController = new Controller(theView, theModel);
		
		//make view visible
		theView.setVisible(true);		
	}
	
}
