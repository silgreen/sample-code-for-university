package JavaSrc.question.Lection16;

public class AnonymousClass {

    public static void main(String[] args) {
        AnonymousClass a = new AnonymousClass();
        B cl = new B();
        a.f(); //i'm not anonymous
        cl.a.f(); //i am anonymous

        /** we can't get access to the f method in the anonymous class B without use the direct reference of it
         * so we call:
         * cl.a.f(); 
         * to print i am anonymous
         * when we can use this strategy?
         * when we want to implement one interface of a specific class, without type a new interface
         * or when we are building complex object like a button of a gui
         */
    }

    public void f() {
        System.out.println("I'm not anonymous!");
    }
}

class B {
    AnonymousClass a = new AnonymousClass() {
        public void f() {
            System.out.println("I am Anonymous!");
        }
    }; //mandatory
}
