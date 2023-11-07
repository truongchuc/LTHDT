package kethua;

public class KeThuaDonGian1 extends KeThuaDonGian {
	private float bonus;

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public KeThuaDonGian1(float salary, float bonus) {
		super(salary);
		this.bonus = bonus;
	}

	public float tinhthucnhan() {
		 return getSalary() + getBonus();
	}
}
