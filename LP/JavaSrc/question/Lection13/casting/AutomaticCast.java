package JavaSrc.question.Lection13.casting;

import JavaSrc.question.Lection13.casting.interfaceII.Squeezing;

public class AutomaticCast {
    public static void main(String[] args) {
        Lemon l, l1, l2[];
        Citrus a, a1[];
        GrapeFruit p;
        l = new Lemon();
        a = l; //auto cast from citrus to lemon
        l1 = (Lemon)a; //legal cast from Lemon to Lemon
        p = (GrapeFruit) a; //illegal cast from a sublcass to a sibling class (Lemon and GrapeFruit)
                            //there are no error in the code editor because that will throw an Execution Error
        Squeezing s, s1[];
        s = l; //legal from interface to class
        l1 = s; //compilation error, because there are not cast
        l1 = (Lemon)s; //now is legal! from interface to sublcass thar heredit the implemntation of the interface from citrus

        l2 = new Lemon[7]; 
        s1 = l2; //array of interface to array of objects
        a1 = (Citrus[]) s1; //array of objects to array of interfaces that are casted to objects
    }
}
