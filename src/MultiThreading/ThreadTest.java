package MultiThreading;

public class ThreadTest extends Thread {
	   
	  public static void main(String args[]){  
	     ThreadTest obj=new ThreadTest();  
	     Thread tobj =new Thread(obj);  
	     tobj.start();  
	  }
	  
	  public synchronized void run(){
		  {
		      try
		      {
		        for (int i=0 ;i<10;i++)
		        {
		          System.out.println("Printing the count " + i);
		          Thread.sleep(1000);
		        }
		     }
		     catch(InterruptedException e)
		     {
		        System.out.println("my thread interrupted");
		     }
		     System.out.println("my thread run is over" );
		   }
		
	  }
	  
}
