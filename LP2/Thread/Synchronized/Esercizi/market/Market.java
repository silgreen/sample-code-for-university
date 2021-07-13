import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Market {
    private BlockingQueue<Double> prices = new LinkedBlockingQueue<>();

    public synchronized void buy(double p) throws InterruptedException {
        
        // prices.removeIf(Predicate<Double> predicate = new Predicate<Double>(){
        //     @Override
        //     public boolean test(Double t) {
        //         // TODO Auto-generated method stub
        //         return false;
        //     }
        // });
        while(!prices.removeIf(number -> number < p)) wait();
        notifyAll();
        
    }

    public synchronized void sell(double p) throws InterruptedException {
        prices.put(p);
        notifyAll();
        System.out.println(prices);
        while(prices.contains(p)) wait();
        return;    
    }

    public static void main(String[] args) {
        Market m = new Market();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    m.buy(10);
                    System.out.println("sono t1");
                } catch (InterruptedException e) {return;}
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    m.sell(15);
                    System.out.println("sono t2");
                } catch (InterruptedException e) {return;}
            }
        };
        Thread t3 = new Thread() {
            @Override
            public void run() {
                try {
                    m.buy(20);
                    System.out.println("sono t3");
                } catch (InterruptedException e) {return;}
            }
        };
        Thread t4 = new Thread() {
            @Override
            public void run() {
                try {
                    m.sell(10);
                    System.out.println("sono t4");
                } catch (InterruptedException e) {return;}
            }
        };
        Thread t5 = new Thread() {
            @Override
            public void run() {
                try {
                    m.buy(12);
                    System.out.println("sono t5");
                } catch (InterruptedException e) {return;}
            }
        };
        Thread t6 = new Thread() {
            @Override
            public void run() {
                try {
                    m.buy(9);
                    System.out.println("sono t6");
                } catch (InterruptedException e) {return;}
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
