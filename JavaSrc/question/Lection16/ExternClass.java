package JavaSrc.question.Lection16;

public class ExternClass {
    private int x = 5;

    public class InnerClass { // the same name of the extern class is illegal
        private int y = 6;

        public void innerMethod() { // this method has access to a private attribute of the extern class
            System.out.println("y = " + y);
            System.out.println("x = " + x);
        }

        public void f(int y) {
            y++; //we update the local variable of the method
            this.y++; // there we update the y attribute of the inner class
            ExternClass.this.x++; // and there we increment the attribute of the x variable in the externClass
        }
    }

    public void externMethod() {
        System.out.println("x = " + x);
    }
}
