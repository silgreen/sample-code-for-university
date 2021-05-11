import java.util.*;

/**
	First Implementation: sub-class of Thread
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
		} catch(InterruptedException e) {  
			return;
		}
	}

	public static void main(String[] args) {
		Thread t = new MyThread();
		System.out.println("Sono il Main *-*");
		t.start();
	}
}