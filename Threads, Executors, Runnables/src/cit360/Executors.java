package cit360;


import org.junit.platform.commons.util.StringUtils;

/**
 * 
 * @author martha
 *
 */

public class Executors {

	public static void main(StringUtils[] args) {
        Executors Exe;
        Exe = Executors.newCachedThreadPool();
        for (var count = 0; count < 12; count++) {
            Runnables Runnable;
            Runnable = new Runnables();
            Exe.execute(Runnable);
        }
        try {
            Thread.sleep(5000);
            System.out.println("Start Thread!");
            for (var count = 0; count < 12; count++) {
                Runnables Runnable;
                Runnable = new Runnables();
                Exe.execute(Runnable);
            }
        } catch (InterruptedException exc) {

        }
    }
	
}
