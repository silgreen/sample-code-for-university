import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList {
    private Nodo testa;

    private static class Nodo {
        Object value;
        Nodo next;
        Nodo(Object v, Nodo n) {
            value = v;
            next = n;
        }
    }

    public void add(Object v) {
        Nodo n = new Nodo(v, testa);
        testa = n;
    }

    public Iterator iterator() {
        return new Iterator(){
            Nodo current = MyList.this.testa;

            @Override
            public Object next() {
                if (current == null) 
                    throw new NoSuchElementException();
                Object v = current.value;
                current = current.next;
                return v;
            }

            @Override
            public boolean hasNext() {
                return current != null;
            }
        };
    }
}
