public class Triangolo {
    double latoA;
    double latoB;
    double latoC;

    public void isTriangolo(double a, double b, double c) throws IlTriangoloNoException {
        if (!(a < b + c && b < a + c && c < a + b))
            throw new IlTriangoloNoException();
    }

    public Triangolo(double a, double b, double c) {
        try {
            isTriangolo(a, b, c);
        } catch (IlTriangoloNoException e) {
            e.printStackTrace();
        }
        latoA = a;
        latoB = b;
        latoC = c;
    }

    public double calcolaArea() {
        double semiPerimetro = (latoA + latoB + latoC) / 2;
        double formula = semiPerimetro * ((semiPerimetro - latoA) * (semiPerimetro - latoB) * (semiPerimetro - latoC));
        double area = Math.sqrt(formula);
        return area;
    }

    static class Rettangolo extends Triangolo {
        public Rettangolo(double a, double b) {
            super(a, b, Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        }
    }

    static class Isoscele extends Triangolo {
        public Isoscele(double a, double b) {
            super(a, b, b);
        }
    }
}
