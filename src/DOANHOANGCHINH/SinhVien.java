package DOANHOANGCHINH;

public class SinhVien extends Nguoi {
	private int maSV;
	private float dtb;
	private String KetQua, XepLoai;

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDtb() {
		return dtb;
	}

	public void setDtb(float dtb) {
		this.dtb = dtb;
	}

	public String getKetQua() {
		return KetQua;
	}

	public void setKetQua(String ketQua) {
		KetQua = ketQua;
	}

	public String getXepLoai() {
		return XepLoai;
	}

	public void setXepLoai(String xepLoai) {
		XepLoai = xepLoai;
	}

	public SinhVien(String hoTen, int tuoi, int maSV, float dtb) {
		super(hoTen, tuoi);
		this.maSV = maSV;
		this.dtb = dtb;
	}

	public SinhVien(String hoTen, int tuoi) {
		super(hoTen, tuoi);
	}

}
