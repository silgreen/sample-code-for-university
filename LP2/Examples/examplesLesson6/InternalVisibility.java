public class InternalVisibility {
    private int n = 42;

    public static class A {
        public void foo(InternalVisibility guest) {
            guest.n = 0; //OK!
        }
    }

    public static class B extends InternalVisibility {
        public void foo() {
             //n = 0; compile-time error
             //this.n = 0; compile time-error

             super.n = 0;//OK!
        }
    }

    /**A and B class can access to the InternalVisibility fields beacuse
     * they are inner classes of InternalVisibility
     */
}
