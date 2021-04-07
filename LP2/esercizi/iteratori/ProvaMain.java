import java.util.Iterator;

public class ProvaMain {
    public static void main(String[] args) {
        MyList l = new MyList();
        l.add("cioa");
        l.add("ciccio");
        l.add("fanculo");

        Iterator i = l.iterator();
        while(i.hasNext()) {
            System.out.println(i.next().toString());
        }
    }
}
