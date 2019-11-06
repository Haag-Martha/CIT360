package cit360;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//Demonstrate Reading a JSON file
public class ReadJsonFile {

	public static void main(String[] args) {
		/*Create a new JSON parser to parse the information from one format to another*/
		JSONParser parser = new JSONParser();

		try {
			/*Create an object to parse */
			Object object= parser.parse(new FileReader("myjson.json"));
			
			//Convert object into a JSON object
			JSONObject jsonObject = (JSONObject) object;
			
			//read "name" from the json file 
			String name= (String)jsonObject.get("name");			
			// display the output to console
			System.out.println("Name of Student: " + name);			
			
			//read "university form the json file
			String university = (String) jsonObject.get("university");
			// display to console
			System.out.println("\nName of University: " + university);
			
			/*Create a JSONArray to get the courses created
			 * by CreateJsonFile. It will iterate through each
			 * of the elements using the key "courses" and display the values to the console.*/
			JSONArray coursesArray = (JSONArray) jsonObject.get("courses");
			
			/*this tells how many elements it will need to loop 
			through in our coursesArray*/
			Iterator<String> iterator = coursesArray.iterator();
			
			System.out.println("\nCourse currently Enrolled: ");
			
			/* This while statement makes sure it keeps iterating through the
			 * file and displaying it to the console until it 
			 * hits the end of the file.*/
			while(iterator.hasNext())
			{
				//display the next value in the Array
				System.out.println(iterator.next());
			}
			// If the file doesn't exist, an exception will be thrown
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			/*Catch any Input or Output exception
			 * that may be thrown program runs*/
		} catch (IOException e) {
			e.printStackTrace();
			//exception thrown if parsing fails
		} catch (ParseException e) {
			e.printStackTrace();
			/* catch any other exceptions not 
			 * caught by the previous exceptions */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
