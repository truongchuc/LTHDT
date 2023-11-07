package lop;

public class Student {
	int id;
	int t;
	String ht;
	float gpa;
	String xl;

	public Student(int id, int t, String ht, float gpa) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.t = t;
		this.ht = ht;
		this.gpa = gpa;
	}

	public String getXl() {
		return xl;
	}

	public void setXl(String xl) {
		this.xl = xl;
	}

	public int getId() {
		return id;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHt() {
		return ht;
	}

	public void setHt(String ht) {
		this.ht = ht;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}


}
