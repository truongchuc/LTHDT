package kethua;

public class KeThua1 {
	private static float salary;

	public static float getSalary() {
		return salary;
	}

	public static void setSalary(float salary) {
		KeThua1.salary = salary;
	}

	public KeThua1(float salary) {
		super();
		this.salary = salary;
	}
}
