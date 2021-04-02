import java.util.*;
class Program {
	private static int temp,speed;
	private LinkedList listaProgrammi = new LinkedList();

	public static class SetTemp {
		public SetTemp(int temperature) { temp = temperature; }
	}

	public static class AddSoap {
	}

	public static class SetSpeed {
		public SetSpeed(int rpm) { speed = rpm; }
	}
	
	public void addAction(Object o) { listaProgrammi.add(o); }

	public void execute(Washer w) {
		for(Object o : listaProgrammi) {
			if(o instanceof SetTemp) w.setTemp(temp);
			if(o instanceof AddSoap) w.addSoap();
			if(o instanceof SetSpeed) w.setSpeed(speed);
		}
	}
}
