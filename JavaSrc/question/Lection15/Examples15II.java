package JavaSrc.question.Lection15;

public class Examples15II {
    public static void main(String[] args) {
        myFun(); //The error will explode in the main
    }
    
    /** This code works properly */
    static void myFun() { doSomething();}
    
    static void doSomething() { //is useless to declare ERRORS!
        try {
            throw new Error();
        } catch (Error e) {
            throw e;
        }
    }
}
