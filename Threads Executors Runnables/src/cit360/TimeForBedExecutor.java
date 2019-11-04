package cit360;

import java.util.concurrent.atomic.AtomicInteger;
//demonstrate Atomic Integer
public class TimeForBedExecutor implements Runnable{
	//create new AtomicInteger object for a loop that will count down to bed time
	
	private AtomicInteger count= new AtomicInteger();
	//create run method
	public void run() {
	//create loop 
		for(int i=10;i>0;i--){
		//call bedTimeCountDown
		bedTimeCountDown(i);

		count.incrementAndGet();

		System.out.println(i+ " Hour(s) until bed time.");
	}
	}
	//get count and return
	public int getCount() {
		return this.count.get();
	}

	//take the i from the loop and tell the method how long to run
	private void bedTimeCountDown(int i) {
		try {
		Thread.sleep(i*300);
		}catch(InterruptedException e) {
		System.out.println(e);
		}
	}
}
