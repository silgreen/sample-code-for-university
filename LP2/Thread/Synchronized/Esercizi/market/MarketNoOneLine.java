import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MarketNoOneLine {
    private BlockingQueue<Double> prices = new LinkedBlockingQueue<>();

    /** in this file i use the iterator to "filter" the bocking queue "manually"
     * so we have another function that search and remove the element that respect the condition, if the procedure finish well we return true
     * In the Market file we do that with removeIf function
     */

    public boolean search(double p, BlockingQueue<Double> priceList) {
        Iterator<Double> i = priceList.iterator();

        while(i.hasNext()) {
            double d = i.next();
            if(d <= p) {i.remove(); return true;}
        }
        return false;
    }

    public synchronized void buy(double p) throws InterruptedException {
        while(!search(p, prices)) wait();
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
