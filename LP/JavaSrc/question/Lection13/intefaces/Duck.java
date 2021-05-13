package JavaSrc.question.Lection13.intefaces;

/** that is another class wich implements the Flying interface, now we must implements the methods of the interface */
public class Duck implements Flying {
    public void fly() {
        System.out.println("Quack Quack Quack! **i'm a duck and i'm flying**");
    }

    public void takeOff() {
        System.out.println("Quack Qua-Quack! **i'm a duck and i take off from the lake**");
    }

    public void land() {
        System.out.println("QUACK! **i'm a duck and i'm landing**");
    }
}

/** Now let's use this two classes in a main to see what will happen */