import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConsumerProducer {

    BlockingQueue buffer = new LinkedBlockingQueue<>();

    public int addResource(int n) {
        try {
            buffer.put(n);
            notifyAll();
            return n;
        } catch (Exception e) {
            return 0;
        }  
    }

    public synchronized Object delResource() {
        Object o = new Object();
        try {
            while(buffer.isEmpty()) wait();
            o = buffer.take();
            notifyAll();
            return o;
        } catch (InterruptedException e) {
            return o.getClass();
        }
    }
    
    public static void main(String[] args) {
        ConsumerProducer c = new ConsumerProducer();

        Thread producer = new Thread() {
            @Override
            public void run() {
                System.out.println("sto aggiungendo " + c.addResource(20));
                System.out.println("sto aggiungendo " + c.addResource(40));
                System.out.println("sto aggiungendo " + c.addResource(50));
                System.out.println("sto aggiungendo " + c.addResource(30));
            }
        };
    
        Thread consumer = new Thread() {
            @Override
            public void run() {
                System.out.println("rimuovo " + c.delResource());
                System.out.println("rimuovo " + c.delResource());
                System.out.println("rimuovo " + c.delResource());
            }
        };

        producer.start();
        consumer.start();
    }
}
