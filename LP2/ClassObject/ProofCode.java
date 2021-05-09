class ProofCode {
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee m = new Manager();
		Class c;
		try {
		c = Class.forName("Employee");
		System.out.println(c.getClass()); 
	} catch (ClassNotFoundException err) {
		err.printStackTrace();
	}
		//if(e == m)
		System.out.println(e.getClass() + " " + m.getClass());
	}
}