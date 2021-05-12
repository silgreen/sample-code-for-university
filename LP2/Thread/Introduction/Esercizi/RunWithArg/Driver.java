import java.util.Collection;
import java.util.HashSet;

class Driver {
	public static void main(String[] args) {
		/**example of a Collection */
		Collection<Integer> s = new HashSet<>();
		s.add(3); s.add(18); s.add(88);


		/**Implementaton on the fly of the RunWithArg interface */
		RunWithArg<Integer> r = new RunWithArg<Integer>() {
			public void run(Integer i) {
				System.out.println(i/2);
			}
		}; 


		/**create the thread as RunOnSet Object and pass through his constructor
		 * the run method of the object r and the collection */
		Thread t = new RunOnSet<Integer>(r,s);
		t.start(); /**output: 1 9 44 */
	}
}