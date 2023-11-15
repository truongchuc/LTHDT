package DOANHOANGCHINH2;

public class Nguoi {
	private String hoTen;
	private int Tuoi;
	private int phuCap;

	public int getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(int phuCap) {
		this.phuCap = phuCap;
	}

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
