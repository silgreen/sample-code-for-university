import java.util.LinkedList;
import java.util.List;

public class Exemple2 {
    /**
     * This page of code is an example of the using of synchronized method
     * this simply run a script that crate two threads, one read a list of int 
     * and the onether one create another list with the same element of the first one.
     * */
    public static synchronized List addElement(List l) { //this is the method declaration
        List result = new LinkedList<>();               //do something
        for (Object object : l) {
            result.add(object);
        }
        return result;
    }

    public static void main(String[] args) {
        List t = new LinkedList();
        t.add(1);t.add(15);t.add(3);

        /**we use anonymous classes to create on the fly threads but
         * we can't use element from the outside of the scope, so all the others operation of the thread
         * must be done in the Thread object itself. it is possible to avoid that creating another class
         * wich extends Thread, or with Runnable interfaces
         */
        Thread t1 = new Thread() { //first thread
            public void run() {
                List result = new LinkedList<>();
                result = addElement(t);
                System.out.println(result);
            };
        };
        Thread t2 = new Thread() { //second thread
            public void run() {
                for (Object o : t) {
                    System.out.println(o);
                }
            };
        };
        t1.start();t2.start();

    }
}
