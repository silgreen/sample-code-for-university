import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExService {
    
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);

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

        Future<?> f[] = new Future[10];
        for(int i = 0; i < 10; i++) {
            f[i] = executor.submit(r);
        }

        for (Future<?> future : f) {
            try {
                future.get();
            } catch (Exception e) {
                //TODO: handle exception
            }
            
        }
    }
}
