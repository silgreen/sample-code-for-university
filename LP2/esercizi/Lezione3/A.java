public class A {
	private B myb;

	private int f(B b) {
		A x = B.copia(b); //copia deve essere un metodo statico
		myb = B.copia(77);
		double d = myb.g(); //qui pensiamo che g debba tornare double
		return myb.g(); //ma qui dobbiamo ritornare un intero
	}
	private int x = B.x; //anche x deve essere statico visto che possiamo
}

public class B extends A {
	public static int x;

	public static A copia(this) { //copia deve ritornare un oggetto di tipo A
		return new A();
	} 

	public double copia(int a) {
		return new B();
	}

	public int g() {
		return 0;
	}
}

