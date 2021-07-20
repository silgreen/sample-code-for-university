import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RunDelayIterator {
    /**
     * 
     * questo metodo ritorna semplicemente un iteratore, quindi non può far partire
     * l'attesa dato che dopo ogni stampa deve attendere non quando esegue il metodo
     * statico
     */
    public static <T> Iterator<T> delayIterator(Iterator<T> i, int n) {

        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return i != null;
            }

            @Override
            public T next() {
                /**
                 * questa è la versione non funzionante: creo il thread con l'attesa e lo lancio
                 * in esecuzione, come output otteniamo tutti gli elementi della lista subito
                 * senza attesa
                 * 
                 * Thread t = new Thread() {
                 * 
                 * @Override public void run() { try { Thread.sleep(n * 1000); } catch
                 *           (InterruptedException e) { return; } } }; t.start();
                 */
                try {
                    Thread.sleep(n * 1000);
                } catch (InterruptedException e) {

                }
                return i.next();
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(3);
        l.add(4);
        l.add(177);

        Iterator<Integer> i = delayIterator(l.iterator(), 2);
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
