package DOANHOANGCHINH2;

public class SinhVien extends Nguoi {
	private int maSV;
	private float dToan, dVan, dAnh, dtb;
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

	public float getdToan() {
		return dToan;
	}

	public void setdToan(float dToan) {
		this.dToan = dToan;
	}

	public float getdVan() {
		return dVan;
	}

	public void setdVan(float dVan) {
		this.dVan = dVan;
	}

	public float getdAnh() {
		return dAnh;
	}

	public void setdAnh(float dAnh) {
		this.dAnh = dAnh;
	}

	public SinhVien(String hoTen, int tuoi, int maSV, float dToan, float dVan, float dAnh, float dtb) {
		super(hoTen, tuoi);
		this.maSV = maSV;
		this.dToan = dToan;
		this.dVan = dVan;
		this.dAnh = dAnh;
		this.dtb = dtb;
	}

	public SinhVien() {
	}

}
