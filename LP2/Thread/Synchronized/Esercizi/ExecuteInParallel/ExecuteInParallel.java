import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ExecuteInParallel {
    BlockingQueue<Thread> listOfThread;
    public void executeInParallel(Runnable r[], int k) {
        listOfThread = new ArrayBlockingQueue<>(k);
        for (Runnable runnable : r) {
            Thread t = new Thread(runnable);
            try {
                listOfThread.put(t);
            } catch (InterruptedException e) {
                return;
            }
            t.start();
            listOfThread.remove();
        }
    }
    public static void main(String[] args) {
        
    }
}
