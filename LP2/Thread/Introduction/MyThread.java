import java.util.*;

/**
	First Implementation: sub-class of Thread
	Every Thread is a class, so we inherit all the methods of the Thread class but a new thread is a new instance of MyThread object
*/
class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Sono un Thread ^-^");
		try {
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			Thread.sleep(1500);
		} catch(InterruptedException e) {  //sleep() is a blocker method, so we must handle the Interruption with an exception
			return;			   //that is a good idea to handle sudden interruption correctly
		}
	}

	public static void main(String[] args) {
		Thread t = new MyThread(); 
		System.out.println("Sono il Main *-*");
		t.start();	//this is the entry point of the Thread 
	}
}
