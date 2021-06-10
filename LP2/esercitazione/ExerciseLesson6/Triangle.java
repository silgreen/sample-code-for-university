public class Triangle {

    private double side1, side2, side3;

    public Triangle(double a, double b, double c) {

        if(!(a < b+c && b < a+c && c < a+b)) throw new IllegalArgumentException();
        
        side1 = a;
        side2 = b;
        side3 = c;
    }

    public double getArea() {
        double semiP = (side1+side2+side3) / 2;
        double calc = semiP * ((semiP-side1)*(semiP-side2)*(semiP-side3)); //Heron's formula
        return Math.sqrt(calc);
    }

    static class Rectangle extends Triangle{
        public Rectangle(double cat1, double cat2) {
            super(
                cat1,
                cat2,
                Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2,2)) //Pytagorean Theorem
            );
        }
    }

    static class Isosceles extends Triangle {
        public Isosceles(double base, double sideL) {
            super(
                base,
                sideL,
                (((2*sideL) + base) - base) / 2 //the third side of an isosceles triangle
                );
        }
    }

    public static void main(String[] args) {
        Triangle x = new Triangle(10, 20, 25);
        /**to use the syntax below the inner classes must be subclass
         * of the object on the left hand side of the . operator
        */
        Triangle y = new Triangle.Rectangle(5,8);
        Triangle z = new Triangle.Isosceles(6, 5);
        System.out.println(x.getArea());
        System.out.println(y.getArea());
        System.out.println(z.getArea());
    }
}
