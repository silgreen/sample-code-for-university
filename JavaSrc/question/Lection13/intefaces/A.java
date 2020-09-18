package JavaSrc.question.Lection13.intefaces;

public class A {
    public static void f() {
        System.out.println("f method in A class");
    }

    public void g() {
        System.out.println("g method in A class");
    }
}

class B extends A {
    public static void f() {
        System.out.println("f method in B class");
    }

    public void g() {
        System.out.println("g method in B class");
    }
}

class C {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A x = b;

        /*  static binding */
        //all three methods have execute that wich is binded coerently to declarations
        a.f(); /* print "f method in A class" */
        b.f(); /* print "f method in B class" */
        x.f(); /* print "f method in A class" */

        /* Dynamic method dispatch */
        a.g(); /* print "g method in A class" */ //normal
        b.g(); /* print "g method in B class" */ //normal
        x.g(); /* print "g method in B class" */ //this is the interesting one!
        
        /* x.g() print g method in B class because it takes g() method from the b object wich is of type B */
    }
}
