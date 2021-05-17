public class Example {
    /**Array example */
    
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3};
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(a[0]++);
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t3.start();
        t2.start();
        t1.start();
    }
}
