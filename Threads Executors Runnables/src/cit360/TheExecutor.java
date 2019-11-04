package cit360;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheExecutor {

	public static void main(String[] args) {

		//Call for threads outside main
		addThreads();

	}
// Create addThreads method to hold the execute threads code
	public static void addThreads() {

		//create fixed thread pool
		 		
		ExecutorService events = Executors.newFixedThreadPool(5);
		
		//execute threads
		 
				events.execute(new DoHomeworkExecutor());
				events.execute(new ReadNewsExecutor(" Ooh, another meltdown..."));
				events.execute(new FeedMeExecutor(" I'm hungry again?!"));
				events.execute(new TimeForBedExecutor());
				
		//Shutdown
		events.shutdown();	
	}
	
}