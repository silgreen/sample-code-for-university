import java.util.Collection;
import java.util.HashSet;

class Driver {
	public static void main(String[] args) {
		Collection<Integer> s = new HashSet<>();
		s.add(3); s.add(18); s.add(88);



		RunWithArg<Integer> r = new RunWithArg<Integer>() {
			public void run(Integer i) {
				System.out.println(i/2);
			}
		};


		
		Thread t = new RunOnSet<Integer>(r,s);
		t.start();
	}
}