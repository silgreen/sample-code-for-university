public class Contract {
    /**
     * Calculate the square
     * 
     * @param x is a non-negative number (pre-condizione)
     * @return the square of x (post-condizione)
     * @throws RuntimeException if x is a negative number (penale)
     */

     public double sqrt(double x) {
         if (x < 0) throw new RuntimeException();
         return Math.sqrt(x);
     }
}
