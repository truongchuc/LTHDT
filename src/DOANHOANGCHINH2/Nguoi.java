package DOANHOANGCHINH2;

public class Nguoi {
	private String hoTen;
	private int Tuoi;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}

	public Nguoi(String hoTen, int tuoi) {
		super();
		this.hoTen = hoTen;
		this.Tuoi = tuoi;
	}

	public Nguoi() {
		super();
	}

}
