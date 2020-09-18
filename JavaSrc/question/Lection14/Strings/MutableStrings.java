package JavaSrc.question.Lection14.Strings;

public class MutableStrings {
    /** if we want to manipulate a lot of strings, is a best idea to use the StringBuffer object
     * instead of String
     */
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Jack");
        s.append(" Ryan");
        System.out.println(s); //Jack Ryan
        /** is very simple to use this object but we must keep attention to : */
        StringBuffer s1 = "abc"; // illegal! there are not auto cast from StringBuffer to String
        StringBuffer s2 = (StringBuffer) "abc"; // illegal! neither the explicit cast works
        s.equals(s1) // works like an == because the equals metho is inherited from the Object class
                    // so to work properly we need to override the equals method for stringbuffer
        /** last but not least String and StringBuffer are final classes, so nada specializations */
    }
}
