public class Exchanger<T> {
    private T first, second;

    public T exchange(T element) throws InterruptedException {
        if(first == null) {
            first = element;
            while(second == null) wait();
            return second;
        }
        if(second != null) throw new InterruptedException();
        second = element;
        notify();
        return first;
    }

    public static void main(String[] args) {
        Exchanger<String> e = new Exchanger<>();
        
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized(e) {
                        System.out.println("sono t1 " + e.exchange("ciao"));
                    }
                } catch (InterruptedException e) {
                    //TODO: handle exception
                }
            };
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized(e) {
                        System.out.println("sono t2 " + e.exchange("pippo"));
                    }
                } catch (InterruptedException e) {
                    //TODO: handle exception
                }
            };
        };
        Thread t3 = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized(e) {
                        System.out.println("sono t3 " + e.exchange("alfonso"));
                    }
                } catch (InterruptedException e) {
                    //TODO: handle exception
                }
            };
        };
        t1.start();
        t2.start();
        t3.start();
    }
}
