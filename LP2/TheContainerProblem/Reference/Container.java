import java.util.*;

class Container {
	private double amount;
	private Set<Container> group;

	public Container() {
		group = new HashSet<>();
		group.add(this);
	}

	public double getAmount() { return amount; }

	public void addWater(double water) {
		double totalWater = amount * group.size();
		double correctAmount = (totalWater + water)/group.size();

		for (Container c : group) {
			c.amount = correctAmount;
		}
	}

	public void connectTo(Container c) {
		if(group == c.group) return;

		int sizeThis = group.size(),
			sizeC = c.group.size();
		double totalThis = amount * sizeThis,
				totalC = c.amount * sizeC,
				newAmount = (totalThis + totalC) / (sizeThis + sizeC);

		group.addAll(c.group);

		for (Container el: c.group)
			el.group = this.group;

		for (Container el : this.group)
			el.amount = newAmount;
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