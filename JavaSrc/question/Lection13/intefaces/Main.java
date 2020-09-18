package JavaSrc.question.Lection13.intefaces;

public class Main {
    public static void main(String[] args) {
        Superman s = new Superman();
        Duck d = new Duck();
        Cat fufi = new Cat();
        Dog bob = new Dog();
        Elephant el = new Elephant();

        /** Superman Methods */
        s.takeOff();
        s.fly();
        s.land();

        /** Duck Methods */
        d.takeOff();
        d.fly();
        d.land();

        /** Animals example */
        fufi.speak();
        bob.speak();
        el.speak();
        /** this example it's usefull to understand that we can use specialization and interfaces as we want
         *  and we can build objects of ani kind of shape or complexity */ 
    }
}

/** If you run the code you will see different prints!*/