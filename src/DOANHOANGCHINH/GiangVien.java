package DOANHOANGCHINH;

public class GiangVien extends Nguoi {
	private int maGV;
	private String khoa, trinhDo;
	private int soTietDay, choose;

	public int getMaGV() {
		return maGV;
	}

	public void setMaGV(int maGV) {
		this.maGV = maGV;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public int getSoTietDay() {
		return soTietDay;
	}

	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}

	public GiangVien(String hoTen, int tuoi) {
		super(hoTen, tuoi);
	}

	public GiangVien(String hoTen, int tuoi, int maGV, String khoa, String trinhDo, int soTietDay) {
		super(hoTen, tuoi);
		this.maGV = maGV;
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDay = soTietDay;
	}

}
