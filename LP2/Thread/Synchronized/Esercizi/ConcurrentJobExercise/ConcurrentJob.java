import java.util.Set;
import java.util.HashSet;

/**
 * Data la seguente interfaccia:
 * public interface predicate<T>() { public boolean test(T); }
 * Implementare il metodo statico concurrentfilter che prende come argomenti un set di x e un predicate di p di tipi compatibili,
 * e restituisce un insieme che contiene quegli elementi di x per i quali la funzione test restituisce true.
 * inoltre il metodo test deve currentfilter deve invocare la funzione test in parallelo sul set x, quindi deve creare tanti threa quanti sono gli elementi di x; 
 */

class ConcurrentJob {
  public static <T> Set<T> concurrentFilter(Set<? extends T> set, Predicate<? super T> p) {
    Set<T> result = new HashSet<>();
    for (T t : set) {
      Thread th = new Thread(new Runnable(){
        @Override
        public void run() {
            if(p.test(t)) {
              synchronized(result) { result.add(t); }
            }
        }
      });
      th.start(); 
      try {
        th.join();
      } catch (Exception e) {}
    }
    return result;
  } 
   public static void main(String[] args) {

    Set<Integer> x = new HashSet<Integer>();
    x.add(1); x.add(2); x.add(5);

    Predicate<Integer> isOdd = new Predicate<Integer>() {
     public boolean test(Integer n) {
     return (n % 2 != 0);
        }
    };

    Set<Integer> y = concurrentFilter(x, isOdd);

    for (Integer n: y)
     System.out.println(n);
   } 
}
