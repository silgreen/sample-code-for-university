/**specialize a class to handle collections with an RunWIthArg argument:
 * in this case we want to apply the thread that implements RunWithArg on all the elements of the Collection
 */

import java.util.Collection;

class RunOnSet<T> extends Thread {
	private RunWithArg<T> run; 
	private Collection<T> col;
	/**use the constructor to save arguments in our object */
	public RunOnSet(RunWithArg<T> r, Collection<T> c) {
		run = r;
		col = c;
	}
	/**and then we can override the run method, because RunOnSet extends Thread using the attributes!
	 */
	@Override
	public void run() {
		for (T el : col) { //for each element of the collection
			run.run(el); //call the run method on the element
			}
		}
}