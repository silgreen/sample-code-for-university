package JavaSrc.question;
public class Lection12 {
    public static void main(String[] args) {
        /* DISCLAIMER!!!
            I give a mine exaplanation, so don't take this examples too serious
         */

        /* A lot of data here */
        Integer x = new Integer(100); //deprecated is an example
        Integer y = new Integer(100); //deprecated is an example
        int x1 = 100;
        float y1 = 100f;
        String str = new String("100");
        String str1 = new String("100");
        String str2 = "100";
        String str3 = "100";

        //Integer == Integer is false, here we are comparing "pointers"
        if (x == y) { 
            System.out.println("Uguali");
        }
        //int == Integer is true because int will be upcasted to Integer, his wrapper type
        if (x1 == y) { 
            System.out.println("Uguali");
        }
        //int == float true, int upast to float and then check the condition
        if(x1 == y1) { 
            System.out.println("Uguali");
        }
        
        //this is an handy case
        if(str == str1) { //false
            System.out.println("Uguali");
        }
        if(str2 == str3) { //true
            System.out.println("Uguali");
        } //why?
        /* if we take a look to the variables declaration we see:
            
            String str = new String("100");
            String str1 = new String("100"); 
           
           this instructions call the constructor of String who 
           allocate the values on the memory heap of the JVM.
           if we compare str with str1 using the "==" we check if they point to the same memory cell.
           In other words we are comparing two pointers each other.
           But the second condition is true, what's happening there? take a closer look to the variables declarations:

            String str2 = "100";
            String str3 = "100";

           the result of comparison is true because Java has a special place for constant String, the String constant pool.
           in this place there are all the constant string that we declare, and all the variables who has the same value, doesn't
           copy another value of the same string but point to the String in the pool. So the variables point at the same object 
        */
    }
}