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