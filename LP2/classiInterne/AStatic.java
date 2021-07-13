public class AStatic {
    private int n = 42;

    private static class B {
        public int numero(AStatic a) {
            return a.n;
        }
    }

    public static void main(String[] args) {
        // AStatic a = new AStatic();
        B b = new B();
        System.out.println(b.numero(new AStatic()));
    }
}
