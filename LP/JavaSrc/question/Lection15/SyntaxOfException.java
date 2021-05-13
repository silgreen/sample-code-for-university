package JavaSrc.question.Lection15;

import JavaSrc.question.Lection15.exceptions.ScreamException;

public class SyntaxOfException {
    public static void main(String[] args) {

        try { //after a try must exist at leat one catch block
            
            if(4 > 3) throw new ScreamException(); // we are handling the exception not declaring
        
        } catch (ScreamException e) { //the order of catches is important. we enter into this catch
            
            e.scream(); //AAAAAAH is shown
        
        }
        
        finally { //optional and this must be the least
            
            System.out.println("finally!"); //and finally is executed
        
        }
    }

    /** if we use a method we must declare that method will throw an exception */
    public void myFunc() throws ScreamException {}
}
