package JavaSrc.question.Lection12;

public class Lection12_2 {
        // what instruction is illegal?
        default String s; //illegal! default is not required
        transient int i = 41; //legal
        public final static native int w(); //legal
        abstract double d; //illegal! we can mark abstract only classes and methods
        abstract final double cosIp(); //illegal! a final method can't be overrided, an abstract method hasn't implementation, so it can be
                                        //defined only with override
}
