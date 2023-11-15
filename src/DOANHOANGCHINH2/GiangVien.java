package DOANHOANGCHINH2;

public class GiangVien extends Nguoi {
	private String khoa, trinhDo;
	private int soTietDay;

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

	public GiangVien(String hoTen, int tuoi, String khoa, String trinhDo, int soTietDay) {
		super(hoTen, tuoi);
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDay = soTietDay;
	}

	public GiangVien(String hoTen, int tuoi) {
		super(hoTen, tuoi);
	}
	
	
	
	



}
