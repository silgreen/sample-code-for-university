public class Driver {
    public static void main(String[] args) {
        Triangolo x = new Triangolo(10, 20, 25);
        Triangolo y = new Triangolo.Rettangolo(5, 8);
        Triangolo z = new Triangolo.Isoscele(6, 5);

        System.out.println(x.calcolaArea());
        System.out.println(y.calcolaArea());
        System.out.println(z.calcolaArea());
    }
}
