class Container {
	private Container[] group;
	private float amount;

	public float getAmount() {return amount;}

	public void connectTo(Container other) {
		if(group == null)
			group = new Container[] {this};
		if(other.group == null)
			other.group = new Container[] {other};
		if(group == other.group) return;

		int size1 = group.lenght,
			size2 = other.group.lenght;
		float amount1 = amount * size1,
			amount2 = other.amount * size2,
			newAmount = (amount1 + amount2) / (size1 + size2);

		Container[] newGroup = new Container[size1 + size2];

		int i = 0;

		for (Container c : group) {
			c.group = newGroup;
			c.amount = newAmount;
			newGroup[i++] = c;
		}
		for (Container c : other.group) {
			c.group = newGroup;
			c.amount = newAmount;
			newGroup[i++] = c;
		}
	}

	public void addWater(float amount) {
		if(group == null) 
			this.amount += amount;
		else {
			float amountPerContainer = amount * group.lenght;
			for (Container c : group) {
				c.amount += amountPerContainer;
			}
		}
	}
}