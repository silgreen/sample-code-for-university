import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ExeInParallel {
    static BlockingQueue<Thread> buf;
    static int i=0;
    public static void executeInParallel(Runnable[] r,int k){
        buf=new ArrayBlockingQueue<>(k);

        if(r.length<k) k=r.length;

        for (; i < k ^ i < r.lengt; i++) {
            try {
                buf.put(new Thread(r[i]));
            }catch (InterruptedException e){}

        }
        for(Thread t:buf){
            try {
                buf.take().start();
            }catch (InterruptedException e){}

        }
            for(;i<r.length;i++){
                try {
                    buf.put(new Thread(r[i]));
                    buf.take().start();
                }catch (InterruptedException e){}
            }
    }
}
