package kethua;

public class KeThua11 extends KeThua1 {
	private static float bonus;

	public static float getBonus() {
		return bonus;
	}

	public static void setBonus(float bonus) {
		KeThua11.bonus = bonus;
	}

	public KeThua11(float salary, float bonus) {
		super(salary);
		this.bonus = bonus;
	}
	
	public static float ThucNhan() {
		return getSalary() + getBonus();
	}
}
