/**
	In this Exercise we want to execute a thread after x milliseconds, but the method wich handle the execution is'nt blocker!
*/

java.util.*;
class PeriodicJob {
	
	public static void Periodic(Runnable r, long mills) {

	}

	public static void main(String[] args) {
		Runnable r = new Runnable {
			@Override 
			public void run() {
				System.out.println("ciao");
			}
		};
		Periodic(r,2000);
	}
}