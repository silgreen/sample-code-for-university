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
		Corrabile c = new Corrabile();
		Thread t = new Thread(c);
		Thread t2 = new Thread(c);
		t.start();
		t2.start();
	}
}