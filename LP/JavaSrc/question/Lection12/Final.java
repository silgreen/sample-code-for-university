package JavaSrc.question.Lection12;

/* con final class A non possiamo avere nessuno tipo di specializzazione, quindi il programma non compila 
                        fino a che la classe A è marcata final                               */
/*final*/ class A {
    int x;
    void y() {x = 1;}
}

class B extends A {
    final A fref = new A();
    final void y() {
        System.out.println("nel metodo y()");
        fref.x = 1234;
    }
}

public class Final {
    
}
