import java.util.Collection;

class RunOnSet<T> extends Thread {
	private RunWithArg<T> run;
	private Collection<T> col;
	public RunOnSet(RunWithArg<T> r, Collection<T> c) {
		run = r;
		col = c;
	}
	@Override
	public void run() {
		for (T el : col) {
			run.run(el);
			}
		}
}