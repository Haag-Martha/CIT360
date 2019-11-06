package cit360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlConnection {

	public static void main(String[] args) throws Exception {

		try {
			// create a new URL connection object then store it
			URL byui = new URL("http://www.byui.edu");

			//open the connection to the site*
			HttpURLConnection byuiConnection = (HttpURLConnection) byui.openConnection();

			// create a buffer reader to read the url object using the above connection
			BufferedReader input = new BufferedReader(new InputStreamReader(byuiConnection.getInputStream()));

			// create a string to read the url from the buffer to use in while loop
			String byuiInput;

			// create while loop to read the info from the buffer and print it to the console
			while ((byuiInput = input.readLine()) != null)
				System.out.println(byuiInput);

			//close connection when done
			input.close();
			
			//catch exceptions for connection error
			
		} 	catch (ConnectException e) {
				System.out.println(e);

			//catch exception for any errors the program throws while running	
			
		} 	catch (IOException e) {
				System.out.println(e);
		}

	}
}
