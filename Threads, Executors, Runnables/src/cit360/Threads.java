package cit360;

/**
 * 
 * @author martha
 *
 */

public class Threads {

	
	public static void main(String[] args) {

        new ThreadNumber(1).start();
        new ThreadNumber(7).start();
        new ThreadNumber(12).start();
        new ThreadNumber(18).start();
        new ThreadNumber(23).start();
    }
}

class ThreadNumber extends Thread {

    int startCount;

    public ThreadNumber(int input) {
        startCount = input;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " will count to 24 | start count from "
                + startCount);
        for (int i = startCount; i < 24; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                ThreadNumber.sleep(3000);

                ThreadNumber.sleep(0, 9999);
            } catch (InterruptedException exc) {
            }
        }
        System.out.println("Success! " 
                + Thread.currentThread().getName() 
                + " is Completed!");
    }
}
