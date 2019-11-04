package cit360;

import java.util.concurrent.TimeUnit;

public class ReadNewsExecutor implements Runnable {

		//declare variable for the thread
		
		private String readingNews;
		
		
		 //constructor
		public ReadNewsExecutor(String readingNews) {
			this.readingNews= readingNews;
	}
		//method for running thread
		public void run() {
			
			//loop 7 times
			for(int i=1; i<=7; i++) {
			//display message when method is locked
			System.out.println("I have to read all the news..." +this.readingNews);
			
			//try to run thread every 3000 ms
			//catch if there are any interruptions
			try {
				TimeUnit.MILLISECONDS.sleep(3000);
			}catch (InterruptedException e) {
				System.out.println(e);
			}
			}
			
		}
	}
