import java.util.*;

class PeriodicJob {
	
	/**
	 * In this exercise we want to execute a thread after p seconds.
	 * It isn't very hard but the method wich will execute the thread it will not be blocker
	 * In other words we mustn't use the Thread.sleep
	 */

	public static void Periodic(Runnable r, long mills) {
		/** ??? maybe we don't know all the story i think! */

		/** this is the classic resolution of this problem, of course we are incurring in a loop. */
		while(!Thread.currentThread().isInterrupted())
			try {
				r.run();
				Thread.sleep(mills);
			} catch (InterruptedException e) {
				return;
			}
		}

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override 
			public void run() {
				System.out.println("ciao");
			}
		};
		Periodic(r,2000); /**output: ciao (every 2 seconds) */
	}
}