import java.util.*;

public class NoBlockingQueue {
    static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized(list) {
                    if(list.add((Integer)20)) {
                        System.out.println("sono t1 e aggiungo 20");
                    }
                }
                
            }
        };

        Thread t4 = new Thread() {
            @Override
            public void run() {
                synchronized(list) {
                    if(list.add((Integer)70)) {
                        System.out.println("sono t4 e aggiungo 70");
                    }
                }
                
            }
        };
    
        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized(list) {
                    try {
                        while(list.isEmpty()) wait();
                    if(list.remove((Integer)20))
                        System.out.println("sono t2 e rimuovo 20");
                        notifyAll();
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }
        };

        Thread t3 = new Thread() {
            @Override
            public void run() {
                synchronized(list) {
                    try {
                        while(list.isEmpty()) wait();
                    if(list.remove((Integer)70))
                        System.out.println("sono t3 e rimuovo 70");
                        notifyAll();
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }
        };
        Thread t5 = new Thread() {
            @Override
            public void run() {
                synchronized(list) {
                    try {
                        while(list.isEmpty()) wait();
                    if(list.remove((Integer)70))
                        System.out.println("sono t5 e rimuovo 70");
                        notifyAll();
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }
        };
        
        Thread t6 = new Thread() {
            @Override
            public void run() {
                synchronized(list) {
                    try {
                        while(list.isEmpty()) wait();
                    if(list.remove((Integer)20))
                        System.out.println("sono t6 e rimuovo 20");
                        notifyAll();
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
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
