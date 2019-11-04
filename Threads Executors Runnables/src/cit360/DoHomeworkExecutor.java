package cit360;

public class DoHomeworkExecutor extends Thread{
	
	public void run() {
		//declare string for message to console
		String doingHomework;
		
		//loop to execute string and display string to console
		for(int i=1; i<=20; i++) {
			doingHomework= "Always doing homeowrk.";
			
			System.out.println(doingHomework);
			
			//tell code to sleep for set amount of time
			try {
				Thread.sleep(1000);
				//exceptions for when thread is interruped, thrown whenever .sleep runs
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
