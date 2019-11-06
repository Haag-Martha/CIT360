package cit360;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray; 
import org.json.simple.JSONObject;


public class CreateJsonFile {
	
	public static void main(String[] args) {
		//create a JSON Object
		JSONObject object= new JSONObject();
		/* after creating JSON object, add information
		into the object. In this example create a student
		transcript with the students name and the university they are attending
		with a key and a value. The key in this case is "name" and
		"university." These will be used later when the JSON file is read.*/
		object.put("name", "Sandra Dee");
		object.put("university", "BYU-Idaho Online");
		
		/* Create a new JSON Array to hold the courses the 
		 * student has taken.*/
		JSONArray list= new JSONArray();
		
		/*We are going to add all the course the student has taken 
		 * to our JSON Array */
		list.add("ACCTG180: Survey of Accounting");
		list.add("ART107: Design and Color ");
		list.add("BIO180: Introduction to Biology I");
		list.add("BUS101: Introduction to Business");
		list.add("CHEM101: Introductory General Chemistry");
		
		/*Put JSON Array into the object created above, giving it
		 *a key of "courses" and values of JSONArray list, "list" */
		object.put("courses", list);
		
		/*Make a file writer to send Object data to storage for later use
		 */
		try(FileWriter file =new FileWriter("myjson.json"))
		{
			/*after creating the file send object to file using toString()*/
			file.write(object.toString());
			
			/*"flush" it to the file (move all the information we have just written 
			to the file)*/
			file.flush();
		}
		/*catch any Input/Output Exception that may be 
		 * be thrown when the program runs.*/
		catch(IOException e)
		{
			/*if an exception is thrown, print out the error and
			 *details */
			e.printStackTrace();
		}
		// print out the object to the console
		System.out.println(object);
	}

}
