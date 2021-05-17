import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Original version of the concurrent filter problem */

public class ConcurrentJob<T> extends Thread  {
    public static <T> Set<T> concurrentFilter(Set<T> s, Predicate<T> p) {
        Set<T> result = new HashSet<>();
        List<Thread> listThread = new ArrayList<>();
            for (T el : s) {
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        synchronized (result) {
                            if (p.Test(el)) {
                                result.add(el);
                            }
                        }
                    }
                });
                listThread.add(t);
                t.start();
            }
                for (Thread elem : listThread) {
                    try {
                        elem.join();
                    }catch (InterruptedException e) {
            }
            return result;
    }
}
