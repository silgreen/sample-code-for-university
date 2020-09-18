package JavaSrc.question.Lection15;

import java.io.EOFException;
import java.io.IOException;

public class Examples15 {
    void f1() {
        f2();
    }
    void f2() {
        throw new IOException(); //Illegal, exception isn't handled
    }
    
    /** no problem with the code below */
    public int f3() throws EOFException {
        return f4();
    } 
    
    public int f4() throws EOFException {
        if(1 > 0) throw new EOFException();
        return 1;
    }

    /** NullPointerEception subclass of RunTImeException is an unchecked Exception, so is useless to declare or handle */
}
