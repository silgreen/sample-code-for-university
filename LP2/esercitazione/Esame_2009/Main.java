class Main {
	public static void main(String[] args) {
		Washer w = new Washer();
		Program p = new Program();
		p.addAction(new Program.SetSpeed(10));
		p.addAction(new Program.AddSoap());
		p.addAction(new Program.SetTemp(30));
		p.execute(w);		
	}
}
