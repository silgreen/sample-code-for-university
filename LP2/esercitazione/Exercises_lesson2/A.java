public class A {
    
    public A() {
        System.out.println("A()");
    }

    public class B extends A {
        public B() {
            this(0);
            System.out.println("B()");
        }

        public B(int n) {
            System.out.println("B(int)");
        }
    }
    public static void main(String[] args) {
        A x = new A();
        x = new B();
    }
    
}