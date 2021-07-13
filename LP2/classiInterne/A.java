public class A {
    /**
     * All'interno di una classe, le classi interne non subiscono restrizioni di
     * visibilità
     */
    private class C {
        private int numero = 34;
        public double media = 23;
    }

    private class B {
        private int numero = 32;

        public void stampaSommaNumero(C c, B b) {
            System.out.println(numero + c.numero);
        }

        public void stampaSommaMedia(C c, B b) {
            System.out.println(numero + c.media);
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.C c = a.new C(); // instanziare una classe interna
        A.B b = a.new B();

        b.stampaSommaMedia(c, b);
        b.stampaSommaNumero(c, b);
    }
}
