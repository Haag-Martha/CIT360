package cit360;

/**
 * 
 * @author martha
 *
 */

public class Runnables {

	 public static String runCheck;
	    public void test(){
	        for(var number=1;number<=24;number++){
	            System.out.println(Thread.currentThread().getName()
	                    +" got number "+ "["+ number +"]" +" right ");
	            var passCheck = this.passCheck(number);
	            if(!passCheck){
	            } else {
	                break;
	            }
	        }
	    }
	    private boolean passCheck(int pass){
	        boolean passCheck;
	          passCheck = false;
	        if((RunnableTask.runCheck==null)&&(pass==24)){
	            String passName=Thread.currentThread().getName();
	            RunnableTask.runCheck=passName;
	            System.out.println("Success! Passed Task");
	            passCheck=true;
	        }
	        else if(RunnableTask.runCheck!=null){
	            if(RunnableTask.runCheck==null){
	                passCheck=true;
	            }
	        }
	        else {
	            passCheck=false;
	        }
	        return passCheck;
	    }
	      @Override
	    public void run(){
	        this.test();
	    }
}
