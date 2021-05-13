class ShortProblem {
    public static void main(String[] args) {
        short s = 9;
        //short x = 9 + s; this line cause a compilation error
        short x = 9 + 9; //that one not! Why?
        System.out.println(x);

        /** the range of the short type is: 
         * -2^15..2^15 - 1 (-31000...30999 more or less)
         * the result of the expression 9 + 9 is correctly in range fo the short type but 9 + s no!
         * because the operator + cause a implicit cast on the s variable to avoid loss of information
         * and so the right side of expression become int value but the variable s is still short!
         */
    }
}