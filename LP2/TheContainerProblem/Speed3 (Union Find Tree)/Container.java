class Container {

	private Container parent = this;
	private double amount;
	private int size = 1;

	private Container findAndCompress() {
		if(parent != this) 
			parent = parent.findAndCompress();
		return parent;
	}

	public void connectTo(Container other) {
		Container c = findAndCompress();
		Container otherParent = other.findAndCompress();

		if(c == otherParent) return;

		int size1 = c.size, size2 = otherParent.size;
		double newAmount = ((c.amount * size1) + (otherParent.amount * size2)) / (size1 + size2);
		

		if(c.size > otherParent.size) {
			otherParent.parent = c.parent;
			c.amount = newAmount;
			c.size += size2;
		} else {
			c.parent = otherParent.parent;
			otherParent.amount = newAmount;
			otherParent.size += size1;
		} 
	}

	public double getAmount() {
		return findAndCompress().amount;
	}

	public void addWater(double w) {
		Container c = findAndCompress();
		c.amount += w / c.size;
	}

		public static void main(String[] args) {
		Container a = new Container();
		Container b = new Container();
		Container c = new Container();
		Container d = new Container();

		a.addWater(12);
		d.addWater(8);

		a.connectTo(b);

		System.out.println("" + a.getAmount() + " " + b.getAmount() + " " + c.getAmount() + " " + d.getAmount());
		b.connectTo(c);
		b.connectTo(c);

		System.out.println("" + a.getAmount() + " " + b.getAmount() + " " + c.getAmount() + " " + d.getAmount());
		c.connectTo(d);
		c.addWater(12);

		System.out.println("" + a.getAmount() + " " + b.getAmount() + " " + c.getAmount() + " " + d.getAmount());
	}
}