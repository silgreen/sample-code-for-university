package JavaSrc.question.Lection16;

import JavaSrc.question.Lection16.ExternClass.InnerClass;

public class Main {
    public static void main(String[] args) {
        //we can buil the objects like that
        ExternClass.InnerClass externClass = new ExternClass().new InnerClass();
        //or like that
        ExternClass e = new ExternClass();
        ExternClass.InnerClass i = e.new InnerClass();
        /** the main thing of the inner classes is that they can't exist without an instance of their extern classes */ 
        
        externClass.innerMethod();
        e.externMethod();
        i.innerMethod();
    }
}
