package JavaSrc.question.Lection14.Strings;

public class Examples {
    public static void main(String[] args) {
        String s = "Jack"; 
        String s2 = s; //this variable refers to constant string of the s variable
        s = s.concat(" Rayan"); // adds Ryan to s String but s2 aren't updated
        System.out.println(s); // Jack Ryan
        System.out.println(s2); // Jack

        /** what's happ if we don't store the result of the concat method? */
        String str = "Jack";
        str.concat(" Ficus"); //we lose the change
        System.out.println(str); // Jack

        /** other examples: */
        String let = "A"; //A
        String let2 = let + "B"; // AB
        let.concat("C"); //useless change
        let2.concat(let); //useless change
        let += "D"; //AD
        System.out.println(let + let2); //ADAB

        /** comparing strings */
        String str1 = "abc";
        String str2 = str1 + " ";
        String str3 = "abc";
        System.out.println(str1 == str2); //false the space is a char, so they are not the same object 
        System.out.println(str1 == str3); //true str1 and str3 refers to the same object in the string constant pool
        
        /** So what's the difference between: */
        String str4 = "abcdef";
        //      and
        String str5 = new String("abcdef");

        if(str4 == str5) System.out.println("are Equals!"); 
        else System.out.println("are not equals!"); //the else will be executed

        /** why the else statement will be executed?
         * the new String() build another object into the haep, so it is another reference
         * instead str4 = "abcdef" refers to the constant String in the String constant pool we have seen before
         * in the next file we will see the best practice to manipulate strings in java
         */
    }
}
