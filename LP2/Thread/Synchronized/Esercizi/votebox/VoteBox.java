
/*
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class VoteBox {
    final int FINE = 50;
    volatile int veri = 0;
    BlockingQueue<Thread> deadPool;

    public VoteBox(int n) {
        deadPool = new ArrayBlockingQueue<>(n);
    }

    public void vote(boolean voto) {
        
        Thread t = new Thread() {
            @Override
                public void run() {
                    veri = 50;
                }
        };
        t.start();
    }

    public void isDone() {
        Thread t = new Thread() {
            @Override
            public void run() {
                 if(veri == 50) System.out.println("Evviva non abbiamo capito niente!");
                 else System.out.println("Evviva non abbiamo capito niente e mezzo!"); 
            }
        };
        t.start();
    }
     * in this piece of code there is a discussion to do
     * the main thread doesn't see the changes that other thread will make, in other words the main isn't effected of race condition
     * because when it starts, whereever thing that it's happening in other parallel thread, se ne accorgerà non immediatamente
     * nel main sottostante il uno dei quattro output sarà zero anche se nel thread che parte quando si chiama la funzione vota l'attributo
     * veri viene aggiornato ed è protetto da volatile.
     * 
     
    public static void main(String[] args) {
        VoteBox b = new VoteBox(50);
        b.vote(true);
        b.isDone();

        System.out.println(b.veri);
        System.out.println(b.veri);
        System.out.println(b.veri);
        System.out.println(b.veri);
    }

}
*/
