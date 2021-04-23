import java.util.*;

class Employee {
	private double salary;

	public Employee() { salary = 1000; }

	public double getSalary() { return salary; }

	public static double getSalarySum(List<? extends Employee> l) { // this method accept all subclasses of Employee
		double total = 0;
		for (Employee e : l) {
			total += e.getSalary();
		}
		return total;
	}

	public static void main(String[] args) {
	Employee e = new Manager();
	Employee e1 = new Manager();
	Employee e2 = new Employee();
	List<Employee> l = new ArrayList<>();
	l.add(e);
	l.add(e1);
	l.add(e2);

	System.out.println("il salario dei dipendenti è: " + Employee.getSalarySum(l)); //output: 3000
	}
}

/** public static double getSalarySum(List<? super Manager> l) this method accept all super classes of Manager, that is Employee, but it accepts even object! **/