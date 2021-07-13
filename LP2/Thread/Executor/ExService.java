import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExService {
    

    /**
     * we must talk
     * Future is useful because when we want wait a thread that compute a task. when it will be done, the thread
     * returns the result of the computation and store it in the future object (and that is the why of the param).
     * but we can use only the Thread pool like a normal single thread
    */


    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10); //

        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
                System.out.println("ciao luigi");
            }
    
        };

        executor.submit(r); //one execution of the task

        for(int i = 0; i < 10; i++) { //all the task will be executed from the same thread??
            executor.submit(r);
        }

        Future<?> f[] = new Future[10];
        for(int i = 0; i < 10; i++) {
            f[i] = executor.submit(r); //every results of the execution of r will be stored in the f[i] object
        }

        for (Future<?> future : f) {
            try {
                future.get(); //this method peek a thread from the thread pool and start it
            } catch (Exception e) {
                //TODO: handle exception
            }
            
        }
    }
}
