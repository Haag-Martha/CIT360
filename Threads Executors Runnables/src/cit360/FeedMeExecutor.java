package cit360;

	import java.util.concurrent.TimeUnit;

	public class FeedMeExecutor implements Runnable{
		//declare variable for use in the thread
		private String timeToEat;
		
		 //constructor for a time to eat
		public FeedMeExecutor(String timeToEat) {
			this.timeToEat= timeToEat;
		}
		//method so the thread will run
		public void run() {

			//create loop
			for(int i=1; i<=5;i++) {
				
			System.out.println("I really gotta eat, I'm starving." +this.timeToEat);
			//run the thread every set period of time 
			try {
				TimeUnit.MILLISECONDS.sleep(4000);
			}catch (InterruptedException e) {
				System.out.println(e);
			}
			}
		
		}
		}

