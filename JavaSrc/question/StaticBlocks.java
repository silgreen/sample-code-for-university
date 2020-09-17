package JavaSrc.question;

public class StaticBlocks {
    static int x = 10; // x is 10
    static { x += 5; } // x is 15 

    //the main doesn't run, we have another static block 
     public static void main( String [] args) {
        System .out . println ("x=" + x); //that prints 3, follow orders of the execution to understand
        }
    
    static { x /= 5; } //now x is 3 and the execution pass to the main and will print 3
}
