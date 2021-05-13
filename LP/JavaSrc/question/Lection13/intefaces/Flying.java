package JavaSrc.question.Lection13.intefaces;

public interface Flying {
    public void land();
    public void takeOff();
    public void fly();
    /* that is an interface, a special class wich provide methods without implementations.
        it can be usefull when we want to define multiple differents objects with similar behaviors 
        there are classes in this package that will use this interface */   
}
