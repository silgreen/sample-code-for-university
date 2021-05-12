import java.util.*;

/**
	SECOND IMPLEMENTIATION: implements Runnable interface
*/

class Corrabile implements Runnable {
	public void run() {
		try {
			for(int i = 0; i < 3; i++) { Thread.sleep(1000); System.out.println("ciao"); }
		} catch (InterruptedException e) {return;}	
}

	public static void main(String[] args) {
		System.out.println("sono il main");
		Runnable c = new Corrabile(); //i declare a c runnable and i make an instance of the object Corrabile
		/** 
		 * How you can see we use the same object c to instantiate the two threads, t and t2, and they will execute
		 * the run method of the Corrabile class
		 */
		Thread t = new Thread(c);
		Thread t2 = new Thread(c);
		t.start();
		t2.start();
	}
}