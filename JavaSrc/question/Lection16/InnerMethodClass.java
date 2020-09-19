package JavaSrc.question.Lection16;

public class InnerMethodClass {
    private int m = (int)(Math.random() * 100);
    public static void main(String[] args) {
        InnerMethodClass obj = new InnerMethodClass();
        obj.doSomething(m, 2*m);
    }

    public void doSomething(int x, final int y) {
        int a = x + y;
        final int b = x - y;
        class Inner {
            public void f() {
                System.out.println("m = " + m); //m is extern attribute so is fine
                System.out.println("x = " + x); //illegal x is not final attribute
                System.out.println("y = " + y); // y is a final parameter
                System.out.println("a = " + a); // illegal a is not final
                System.out.println("b = " + b); // b is final
            }
        }
        Inner obj1 = new Inner();
        obj1.f();
    }
}
