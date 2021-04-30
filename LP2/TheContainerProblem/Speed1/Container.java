import java.util.*;

class Container {
	Group group = new Group(this); 
	private static class Group {
		double amountPerContainer;
		Set<Container> members;

		Group(Container c) {
			members = new HashSet<>();
			members.add(c);
		}
	}

		public double getAmount() {
			return group.amountPerContainer;
		}

		public void addWater(double water) {
			double correctWater = water / group.members.size();
			group.amountPerContainer += correctWater;
		}

		public void connectTo(Container c) {

		if(group == c.group) return;

		int sizeThis = group.members.size(),
			sizeC = c.group.members.size();

		double totalThis = group.amountPerContainer * sizeThis,
				totalC = c.group.amountPerContainer * sizeC,
				newAmount = (totalThis + totalC) / (sizeThis + sizeC);

		group.members.addAll(c.group.members);

		for (Container el : c.group.members)
			el.group = group;

		group.amountPerContainer = newAmount;
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