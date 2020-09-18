package JavaSrc.question.Lection13.intefaces;

/** A class that wants to use an interface is declared like that */
public class Superman implements Flying { //we must implement all the methods 
    public void fly() {
        System.out.println("I'm SuperMan and i'm flying!");
    }

    public void takeOff() {
        System.out.println("I'm SuperMan and i take off from Metropolis!");
    }

    public void land() {
        System.out.println("I'm SuperMan and i'm landing!");
    }
/** We can specialize a lot more this class, but for the interfaces is enough. let's jump to another class! */
}
